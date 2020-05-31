class Driver extends Account{
    constructor(id, name, document, email, password){
        super(name, document)
        super.id = id;
        super.email = email;
        super.password = password;
    }
}