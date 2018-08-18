------------Recipt Maker-----------------------------
create table Recipt(
id int primary key identity(1,1),
number varchar(300) 
)
select Count(id) as num from Recipt
select * from Recipt
------------Recipt Maker-----------------------------



------------Item Price List-----------------------------
create table price (
id int identity(1,1) primary key,
item varchar(20),
price int
)
select * from price
------------Item Price List-----------------------------

create table reserve(
[id] [int] IDENTITY(1,1) NOT NULL,
	[recipt] [varchar](20) NULL,
	[item] [varchar](30) NULL,
	[item_quantity] [int] NULL,
	[item_rate] [int] NULL,
	[dish] [varchar](50) NULL,
	[dat] Date NULL,
)

select * from reserve where recipt='O_B7653'
insert into reserve values ('123','Extra',25,40,'biryani')


select * from reserve where recipt='O_B7653' and item = 'NORMAL RICE'



select dish as Dish, item as Item,item_quantity as Item_Quantity,item_rate as Item_Rate ,
(item_quantity * item_rate) as Total 
from reserve where recipt = 'O_B76140'



select * from booking


create table booking (
id int identity(1,1) not null primary key,
[date] varchar(20),

B1 varchar(20),
B2 varchar(20),
B3 varchar(20),
B4 varchar(20),
B5 varchar(20),
B6 varchar(20),
B7 varchar(20),
B8 varchar(20),
B9 varchar(20),
B10 varchar(20),
B11 varchar(20),
B12 varchar(20),
B13 varchar(20),
B14 varchar(20),
B15 varchar(20),
B16 varchar(20),
B17 varchar(20),
B18 varchar(20)
)

select * from booking


create table total(
id int identity(1,1),
receipt varchar(20),
total varchar(20)
)

insert into total  values('asdf','15000')

select * from booking where [date] = '1/8/2017'



UPDATE booking SET 
B1 = '100',B2 = '100',B3 = '100',B4 = '70',B5 = '0',B6 = '0',B7 = '0',B8 = '0',B9 = '0',
B10 = '0',B11 = '0',B12 = '0',B13='0',B14='0',B15='0'
WHERE [date] = '01/8/2017'



create table vendor (
id int identity(1,1) primary key,
dat varchar(20),
vendor_name varchar(20),
rice varchar(20),
potato varchar(20),
masala varchar(20),
oil varchar(20),
chiken varchar(20),
beef varchar(20)
)



create table vendor_price(
v_id int identity(1,1) foreign key references vendor(id) ,
dat varchar(20),
vendor_name varchar(20),
rice_p varchar(20),
potato_p varchar(20),
masala_p varchar(20),
oil_p varchar(20),
chiken_p varchar(20),
beef_p varchar(20)
)

select ve.vendor_name,ve.dat,ve.rice,ve.potato,ve.chiken,ve.beef,ve.oil,ve.masala,v.rice_p,v.potato_p,v.chiken_p,v.beef_p,v.oil_p,
v.masala_p 
from vendor_price v
inner join 
vendor ve
on v.v_id=ve.id
where v.dat='21/6/2017' And v.vendor_name = 'ibtesam'



select * from vendor
insert into vendor_price values ('21/6/2017','saami','100','20','0','0','0','50')
insert into vendor values ('21/6/2017','saami','100 kg','0k g','10 kg','0 kg','0 kg','0 kg')


create table book_time(
id int identity(1,1) ,
[recipt] [varchar](20) NULL,
booking_time nvarchar(20),
booking_date nvarchar(20)
)
insert into book_time values ('O_B76101','5:00','20/70/2017')
select * from book_time where recipt='O_B76257'



select * from Pay


create table Pay(
id int identity(1,1),
[recipt] [varchar](20) NULL,
cos_name varchar(30),
bill_amount varchar(20),
amount_payble varchar(20),
amount_return varchar(20),
amount_remain varchar(20),
Booking_person varchar(20),
cell# varchar(70),
Adress varchar(50),
[date] Date,
Discount int,
[Target] varchar(20),
edit varchar(20),
cell#2 varchar(50)
)

insert into Pay values ('O_B763000','Nadeem Ahmed','75000','71000','0','4000','ibti','0333','nazimaabad','9/8/2017','2000','12/8/2017','1','033391077766')
select * from Pay where recipt='O_B763000'











select * from Pay

select SUM(item_quantity*item_rate)as tot from reserve where recipt='O_B7623'
-----bill print View-------
select rs.recipt, rs.dish as Dish, rs.item as Item,rs.item_quantity as Item_Quantity,rs.item_rate as Item_Rate ,
(rs.item_quantity * rs.item_rate) as Total, bt.booking_date,bt.booking_time, p.cos_name,(p.bill_amount - p.Discount)as bill,p.Discount,p.amount_payble
,p.amount_remain,p.amount_return,p.cell#,p.Adress,p.Booking_person,p.bill_amount,p.edit
 from reserve rs 
inner join book_time bt
On rs.recipt = bt.recipt
inner join Pay p
on rs.recipt = p.recipt
where rs.recipt = 'O_B7623'
order by rs.dish
-----bill print View-------



select * from book_time where recipt='O_B76300'






-----reservation print View-------
select r.recipt,r.dish,r.item,r.item_quantity,r.item_rate,(r.item_quantity*r.item_rate)as tot  from reserve r
left join total t 
on r.recipt = t.receipt
where r.recipt = 'O_B7645'
order by dish
-----reservation print View-------












-----History View-------
select distinct p.recipt aS [Reciept #],
 b.booking_date as [Booking Date],p.cos_name as [Costumer Name]
, (p.bill_amount-P.Discount) aS [Bill Amount],p.amount_payble as [Amount Payble],
p.amount_remain as [Amount Remainig],P.cell#,P.[Target]
 from Pay p
inner join book_time b
on p.recipt = b.recipt
where b.booking_date between '1/8/2017' and '9/8/2017'
order by 
------History View-------

select * from book_time

select * from Pay









update book_time set booking_date='"+b_date+"',booking_time='"+radio+"' 
where recipt='O_B76300'





select * from book_time where recipt='O_B76265' 


select * from Pay where recipt='O_B76258'

select * from booking where recipt='O_B76258'

select * from reserve where recipt ='O_B76210'

select sum(item_quantity* item_rate)as total from reserve where recipt = 'O_B76210'




UPDATE reserve 
SET  item='CHICKEN',item_quantity = 175,item_rate= 330 
WHERE recipt = 'O_B76114' and item = 'BEEF'

select amount_payble as amn from Pay where recipt='O_B76127'


UPDATE Pay 
SET  bill_amount= 330,amount_payble=300,amount_remain=898 
WHERE recipt = 'O_B76127'





select cos_name, recipt,bill_amount,amount_payble,amount_remain,cell# from Pay 
where recipt = 'O_B76162'

select * from Pay where recipt = 'O_B76221'

UPDATE Pay 
SET  amount_payble='300',amount_remain='898'
WHERE recipt = 'O_B76127'


select * from reserve where recipt='O_B76221'

UPDATE reserve SET dish='Coldrink',  item='DEW',item_quantity = 500,item_rate=20 
WHERE recipt = 'O_B76221' and item = 'SPRITE' 



select sum(item_quantity* item_rate)as total from reserve where recipt = 'O_B76227' and (dish =
'QORMA' or dish = 'KARAHI' or dish = 'WHITE KARAHI' or dish = 'TIKKA KARAHI' or dish = 'ACHAR GHOSHT'
 or dish = 'GREEN KARAHI' or dish = 'BADAMI QORMA' or  dish =
'SELA BIRYANI' or dish = 'BASMATI BIRYANI' or dish = 'YAKHNI PILAO' or dish = 'TIKKA BIRYANI' )



select sum(item_quantity* item_rate)as total from reserve where recipt = 'O_B76231' and 
(dish ='SELA BIRYANI EXTRA' or dish = 'BASMATI BIRYANI EXTRA' or dish = 'YAKHNI PILAO EXTRA'
 or dish = 'TIKKA BIRYANI EXTRA' )
 
 
select sum(item_quantity* item_rate)as total from reserve where recipt = 'O_B76233' and (dish =
'KHEER' or dish = 'RABRI KHEER' or dish = 'CUSTURD' or dish = 'LABI SHERI' or dish = 'DODH DULARI'
 or dish = 'GAJAR KA HALWA' or dish = 'LOKI KA HALWA' or  dish =
'GULAB JAMAN' or dish = 'SOJI KA HALWA')

 
 select sum(item_quantity* item_rate)as total from reserve where recipt = 'O_B76234' and (dish =
'Zarda VIP' or dish = 'Zarda Zafrani' or dish = 'Zarda full VIP' or dish = 'Zarda normal')
 

  select sum(item_quantity* item_rate)as total from reserve where recipt = 'O_B76236'
   and dish ='Coldrink'
    
 
  select sum(item_quantity* item_rate)as total from reserve where recipt = 'O_B76236'
   and dish ='Coldrink Jambo'
   
  select sum(item_quantity* item_rate)as total from reserve where recipt = 'O_B76237'
   and item ='Rotiyan'
   
   
   
   
   
   
      
   
   select * from reserve where recipt='O_B76240'
    
     select sum(item_quantity* item_rate)as total from reserve where recipt = 'O_B76240'
   and dish ='Mineral Water'
   
   
   
   
   create table price(
   id int identity(1,1) primary key,
   item varchar(50),
   item_price varchar(20) 
   )
   
   select item,item_price from price
   
UPDATE price SET item_price='20' where item = 'potato'






select * from reserve where recipt='O_B763'
select * from Pay where recipt='O_B763'
select * from book_time where recipt='O_B763'
select * from booking







-----History View-------
select distinct p.recipt aS [Reciept #],p.[date],
 b.booking_date as [Booking Date],p.cos_name as [Costumer Name]
, p.bill_amount aS [Bill Amount],p.amount_payble as [Amount Payble],
p.amount_remain as [Amount Remainig]
 from Pay p
inner join book_time b
on p.recipt = b.recipt
where b.booking_date between '1/8/2017' and '8/8/2017'
order by p.[date]
------History View-------





select bill_amount,edit from Pay
where recipt='O_B76298'


update Pay set bill_amount=45000,edit=2
where recipt='O_B76298'



select * from Pay


select r.dish as Dish,r.item as Item,r.item_quantity as Item_Quantity,r.item_rate as Item_Rate,(r.item_quantity * r.item_rate) as Total
 from reserve r
 inner join total p
 on r.recipt=p.receipt 
where p.cell='03339107429'


select distinct r.recipt as rec
 from reserve r
 inner join total p
 on r.recipt=p.receipt 
where p.cell='03339107429'


select sum(r.item_quantity * r.item_rate) as Total
 from reserve r
 inner join total p
 on r.recipt=p.receipt 
where p.cell='03339107429'









select * from reserve where recipt='O_B7624'













select * from Pay where recipt='O_B76312'
select * from book_time where recipt='O_B76312'

select * from total


-----History View updated query-------
select p.recipt aS [Reciept #],CONVERT(varchar(25), p.[date],106)as [Date],
 b.booking_date as [Booking Date],p.cos_name as [Costumer Name]
, (p.bill_amount-P.Discount) aS [Bill Amount],p.amount_payble as [Amount Payble],
p.amount_remain as [Amount Remainig],P.cell#,P.[Target]
 from Pay p
inner join book_time b
on p.recipt = b.recipt
where p.[date] between '8/16/2017' and '8/18/2017'
order by p.[date]
------History View-------





create table datee(
id int identity(1,1) primary key,
B_Date Date
)

select * from datee
select CONVERT(varchar(25), B_Date,106)as [Date] from datee where B_Date between '8/1/2017' and '8/7/2017'

insert into datee values('8/7/2017')











select cos_name, recipt,(bill_amount-Discount) aS [Bill Amount]
,amount_payble,amount_remain,cell# from Pay where recipt = 'O_B7644'