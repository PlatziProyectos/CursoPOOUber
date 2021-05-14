<?php
require_once("account.php");

class Driver extends Account{

    public function __construct($id, $name){
        parent::__construct($id, $name);
    }

    public function __toString(){
        return parent::__toString();
    }
} 