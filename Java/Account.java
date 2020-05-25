class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(/* Parámetros obligatorios para que se cree un objeto de tipo Account, independientemente del tipo de objeto que desee: user; driver, que son los que heredan de Account */ String name, String document ){
        this.name = name;
        this.document = document;
    }
}