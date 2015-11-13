<?php
function f()
{
    $r = [];
    for ($i = 0; $i < 26; $i++) {
        $s = range('a', 'z');
        $s[$i] = strtoupper($s[$i]);
        $r[] = implode('', $s);
    }
    $s = array_reverse($r);
    array_shift($s);
    echo implode('<br>', $r) . '<br>' . implode('<br>', $s);
}
