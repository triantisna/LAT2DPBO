<?php

require ('Human.php')

$human1 = new Human('Trian', '2001408', '000112333', 'Laki-Laki', 'triannih@email.edu',
                    'UPI', 'Depilkom', 'Ilmu Komputer');
echo $human1->get_nama();
echo $human1->get_NIM();
echo $human1->get_NIK():
echo $human1->get_jenis_kelamin();
echo $human1->get_email_edu();
echo $human1->get_asal_univ():
echo $human1->get_fakultas();
echo $human1->get_prodi():

?>