package contracts.sayhello

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name("Should respond with message" )
    description( "Returns JSON with a message" )

    request {

        method POST()

        urlPath("/sayHello" ) {

            queryParameters {

                parameter 'name' : 'Dan'

            }

        }


    }

    response {

        status OK()

        headers{
            header( contentType(), applicationJsonUtf8() )
        }

        body([
                message: "Hello, Dan"
        ])

    }

}

