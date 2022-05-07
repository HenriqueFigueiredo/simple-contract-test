package contracts

org.springframework.cloud.contract.spec.Contract.make {
    """
Should return that is a rectangle

```
given:
	That the base and the height are different
when:
	The client executes the validation
then:
	The api returns a rectangle
```

"""
    request {
        method 'POST'
        url '/api/v1/square/validation'
        body([
                base: 2,
                height: 4
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status 200
        body([
                squareType: "RECTANGLE"
        ])
        headers {
            contentType('application/json')
        }
    }
}