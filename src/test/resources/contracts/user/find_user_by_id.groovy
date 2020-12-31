package contracts.user

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name "find user by id"
    description "should return correct user by id=1"

    request {
        url "/api/v1/user/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson();
        }

        body(
                id: 1,
                firstName: "Mehmet",
                lastName: "Pekdemir",
                title: "Software Engineer"
        )

    }

}