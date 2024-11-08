
Please check the query method in the Config.java file and the corresponding scahem.graphqls file.


The following jon query method corresponds to
```graphql
query MyQuery {
  findAllUsers(userInput: { name: "add", address: { country: "12" } }) {
    address {
      city
      country
      id
      province
    }
    id
    name
    password
    phone
  }
}
```