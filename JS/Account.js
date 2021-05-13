function Account (id, name) {
    this.id = id;
    this.name = name;
    this.document;
    this.email;
    this.password;
}

Account.prototype.toString = function(){
    console.log(this.id);
    console.log(this.name);
    console.log(this.document);
    console.log(this.email);
    console.log(this.password);
}