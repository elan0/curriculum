問題３、

SELECT * FROM staff;

問題４、

INSERT INTO staff
(id,name)values
('0007','鈴木三郎',);

問題５

INSERT INTO staff
(id,name)values
('0008','鈴木四郎',);

問題6

SELECT * FROM staff
WHERE
id = '0005' or name like '%鈴木%';

問題7、

UPDATE staff SET
name = '児嶋健'
WHERE 
name = '鈴木四郎';

問題8、

SELECT id,name FROM staff WHERE
entrance_year = 1995;

