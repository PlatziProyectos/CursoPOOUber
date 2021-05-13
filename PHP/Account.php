<?php
    class Account {
        public $id;
        public $name;
        public $document;
        public $email;
        public $password;

        public function __construct($id, $name){
            $this->id = $id;
            $this->name = $name;
        }

        public function toString(){
            return "[id : $this->id, name : $this->name, document : $this->document, email : $this->email, password : $this->password]";
        }

    }
?>