<?php
function f($s)
{
    if (!preg_match('/^[0-1]{2,}$/', $s)) {
        return $s;
    }

    $r = 0;
    $c = strlen($s);
    for ($i = 0; $i < $c; $i++) {
        $r += $s[$i] * pow(2, $c - $i - 1);
    }
    return f($r . '');
}
