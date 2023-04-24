DROP TABLE tableA;
CREATE TABLE TableA (
	Num1 Int
);

CREATE TABLE TableB (
	Num2 Int
);

DESC TableA;
DESC TableB;


INSERT INTO TableA (Num1)
VALUES (1);

INSERT INTO TableA (Num1)
VALUES (2);

INSERT INTO TableA (Num1)
VALUES (3);

INSERT INTO TableA (Num1)
VALUES (4);

INSERT INTO TableA (Num1)
VALUES (5);

INSERT INTO TableB (Num2)
VALUES (3), (4), (5), (6), (7); -- 거의 안일어나는 일

SELECT * FROM TableA; -- 1,2,3,4,5
SELECT * FROM TableB; -- 3,4,5,6,7

SELECT * FROM TableA JOIN TableB; -- cartesian product

-- 같은값만 찾는다면? 이것이 InnerJoin

SELECT * FROM TableA a Join TableB b
ON a.num1 = b.num2;


-- Left Join InnerJoin + 왼쪽에만 있는것 
SELECT * FROM TableA a LEFT Join TableB b
ON a.num1 = b.num2; -- LEFT(Outer) JOIN 

-- Right Outer Join
SELECT * FROM TableA a Right Join TableB b
ON a.num1 = b.num2;
