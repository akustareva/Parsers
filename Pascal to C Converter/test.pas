{vars
 declaration
 block}
var a1, a2, a3:integer; var b1, b2, b3:boolean; c1, c2:char; d1, d2, tmp:double;
const c_i:integer = 3; c_d:double = 5;
const c_c:char = 5;
{ begin program }
begin

    read(c_i);
    readln(c_d, c_c);
    write(c_i, c_d);

    (* reading part *)
    read(a1, a2);
    readln(a3);
    read(c1);
    readln();
    readln(c2);

    (* calculate
        expr    *)
    d1 := a1 * 5674 / 674 - a2 / 56 + a3 /674 - 78 * 90;
    d2 := d1 - a1 + a2;
    tmp := d2;

    (* writing part *)
    write(a1, a2, a3);
    writeln();
    writeln(b1, b2, b3);
    write(d1);
end.