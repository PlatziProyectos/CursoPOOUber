<?php
    require_once('car.php');

    class UberBlack extends Car {
        public $typeCarAccepted;
        public $seatsMaterial;

        public function __construct($id, $license, $driver, $passegenger, $typeCarAccepted, $seatsMaterial) {
            parent::__construct($id, $license, $driver);
            $this->typeCarAccepted = $typeCarAccepted;
            $this->seatsMaterial = $seatsMaterial;
            $this->setPassegenger($passegenger);
        }

        public function __toString(){
            if ($this->passegenger != null) {
                return "[typeCarAccepted : " . print_r ($this->typeCarAccepted) . ", seatsMaterial : " . print_r ($this->seatsMaterial) . ", Car : " . parent::__toString() . "]";
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