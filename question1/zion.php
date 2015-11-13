<?php
function f($s)
{
    $a = '';
    for ($i = 0; $i < strlen($s); $i++) {
        $a .= ('1' == $s[$i] ? '0' : '1');
    }
    return $a;
}
