<?php
    require_once('account.php');
    class Car {
        public $id;
        public $license;
        public $driver;
        protected $passegenger;

        public function __construct($id, $license, $driver){
            $this->id = $id;
            $this->license = $license;
            $this->driver = $driver;
        }

        public function __toString(){
            return "[id : $this->id, licencia : $this->license, Driver : " . $this->driver->__toString() . "]";
        }

        public function getPassegenger(){
            return $this->passegenger;
        }

        public function setPassegenger($passegenger){
            $this->passegenger = $passegenger;
        }
    }

?>