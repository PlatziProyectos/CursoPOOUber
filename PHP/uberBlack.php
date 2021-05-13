<?php
    require_once('car.php');

    class UberBlack extends Car {
        public $typeCarAccepted;
        public $seatsMaterial;

        public function __construct($id, $license, $driver, $typeCarAccepted, $seatsMaterial) {
            parent::__construct($id, $license, $driver);
            $this->typeCarAccepted = $typeCarAccepted;
            $this->seatsMaterial = $seatsMaterial;
        }

    }

?>