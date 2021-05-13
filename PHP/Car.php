<?php
    require_once('account.php');
    class Car {
        public $id;
        public $license;
        public $driver;
        public $passegenger;

        public function __construct($id, $license, $driver){
            $this->id = $id;
            $this->license = $license;
            $this->driver = $driver;
        }

        public function toString(){
            echo "id : $this->id, licencia : $this->license, Driver : " . $this->driver->name;
        }
    }

?>