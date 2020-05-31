class Account {
    constructor(name, document){
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }

    printDataUser(){
        console.log(this.id)
        console.log(this.name)
        console.log(this.document)
        console.log(this.email)
        console.log(this.password)
    }
}