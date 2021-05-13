class UberPool extends Car {

    constructor(id, license, driver, brand, model){
        super(id, license, driver);
        this.brand = brand;
        this.model = model;
    }

    toString(){
        super.toString();
        console.log(this.brand);
        console.log(this.model);
    }
}