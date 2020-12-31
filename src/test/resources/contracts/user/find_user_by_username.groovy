package contracts.user

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name "find users"
    description "should return correct user by username=Mehmet"

    request {
        url "/api/v2/user/Mehmet"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson();
        }

        body(
                id: 2,
                firstName: "Mehmet",
                lastName: "Pekdemir",
                title: "Software Engineer"

        )
    }

}

