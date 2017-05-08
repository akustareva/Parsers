program my_first_program;
var i, i1, i2:integer; c:char; var d:double;
begin
    read(i);
    readln(d);
    read(i, c);
    readln(c, d);
    write(i);
    writeln(c);
    write(i, d);
    writeln(c, d);
    i := 5;
    i1 := i;
    i2 := 876 + i * i1 + i1 /6;
end.