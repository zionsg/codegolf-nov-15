<?php
function f($s)
{
    $r = '';
    for ($i = 97; $i < 123; $i++) {
        $r .= str_repeat(chr($i), $i - 96);
    }
    return ($s == $r ? 42 : -1);
}
