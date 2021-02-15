# Log Service

**Build in Node js w/ express**

## POST

```sh
http://localhost:3000/logger
```

### Body

| **Body url** encoded |                                             |
| -------------------- | ------------------------------------------- |
| verificationId       | queried code                                |
| host                 | host ip                                     |
| userAgent            | agent (browser)                             |
| isValid              | tells if is certified is verified correctly |

### Response

Identifier of file if success.

## GET

```sh
http://localhost:3000/logger/:id
```

### Response

Json with log content.