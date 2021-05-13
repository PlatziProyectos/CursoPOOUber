class Car {

    constructor(id, license, driver) {
        this.id = id;
        this.license = license;
        this.driver = driver;
        this.passegenger;
    }

    toString() {
        console.log(this.id)
        console.log(this.license)
        console.log(this.driver)
        console.log(this.passegenger)
    }
}