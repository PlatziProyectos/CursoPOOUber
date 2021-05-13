<?php
    require_once('car.php');

    class UberVan extends Car {
        public $typeCarAccepted;
        public $seatsMaterial;

        public function __construct($id, $license, $driver, $typeCarAccepted, $seatsMaterial) {
            parent::__construct($id, $license, $driver);
            $this->typeCarAccepted = $typeCarAccepted;
            $this->seatsMaterial = $seatsMaterial;
        }

        public function toString(){
            return "[typeCarAccepted : $this->typeCarAccepted, seatsMaterial : $this->seatsMaterial, Car : " . parent::toString() . "]";
        }

    }

?>