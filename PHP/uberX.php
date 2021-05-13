<?php
    require_once('car.php');

    class UberX extends Car {
        public $brand;
        public $model;

        public function __construct($id, $license, $driver, $brand, $model) {
            parent::__construct($id, $license, $driver);
            $this->brand = $brand;
            $this->model = $model;
        }

        public function toString(){
            return "[brand : $this->brand, model : $this->model, Car : " . parent::toString() . "]";
        }

    }

?>