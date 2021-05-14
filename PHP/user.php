<?php
require_once("account.php");

class User extends Account{

    public function __construct($id, $name){
        parent::__construct($id, $name);
    }

    public function toString(){
        return parent::toString();
    }
}