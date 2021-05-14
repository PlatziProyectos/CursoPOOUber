<?php
    require_once('car.php');

    class UberPool extends Car {
        public $brand;
        public $model;

        public function __construct($id, $license, $driver, $passegenger, $brand, $model) {
            parent::__construct($id, $license, $driver);
            $this->setPassegenger($passegenger);
            $this->brand = $brand;
            $this->model = $model;
        }

        public function __toString(){
            if ($this->passegenger != null) {
                return "[brand : $this->brand, model : $this->model, Car : " . parent::__toString() . "]";
            } else {
                return "";
            }  
        }

        public function setPassegenger($passegenger){
            if ($passegenger == 4) {
                $this->passegenger = $passegenger;
            } else {
                echo "Debe ingresar 4 passegenger";                
            }
        }
    }

?>