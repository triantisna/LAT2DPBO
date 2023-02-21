<?php

    class SivitasAkademik{
        private $asal_univ = '';
        private $email_edu = '';

        public function __construct($asal_univ = '', $email_edu = ''){
            $this->asal_univ = $asal_univ;
            $this->email_edu = $email_edu;
        }

        public function set_asal_univ($asal_univ){
            $this->asal_univ = $asal_univ;
        }
        public function get_asal_univ(){
            return $this->asal_univ;
        }

        public function set_email_edu($email_edu){
            $this->email_edu = $email_edu;
        }
        public function get_email_edu(){
            return $this->email_edu;
        }
    }


?>