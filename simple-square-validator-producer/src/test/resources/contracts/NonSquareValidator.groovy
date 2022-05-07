package contracts

org.springframework.cloud.contract.spec.Contract.make {
    """
Should return that is not a square

```
given:
	That the base is negative
when:
	The client executes the validation
then:
	The api returns that not a square
```

"""
    request {
        method 'POST'
        url '/api/v1/square/validation'
        body([
                base: -2,
                height: 2
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status 200
        body([
                squareType: "NON_VALID_SQUARE"
        ])
        headers {
            contentType('application/json')
        }
    }
}