package contracts

org.springframework.cloud.contract.spec.Contract.make {
    """
Should return that is a square

```
given:
	That the base and the height are equals
when:
	The client executes the validation
then:
	The api returns a square
```

"""
    request {
        method 'POST'
        url '/api/v1/square/validation'
        body([
                base: 2,
                height: 2
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status 200
        body([
                squareType: "SQUARE"
        ])
        headers {
            contentType('application/json')
        }
    }
}