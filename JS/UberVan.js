class UberVan extends Car {

    constructor(id, license, driver, typeCarAccepted, seatsMaterial){
        super(id, license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    toString(){
        super.toString();
        console.log(this.typeCarAccepted);
        console.log(this.seatsMaterial);
    }
}