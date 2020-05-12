declare @count as int
begin tran

select @count=ticketCount  from  Ticket 

waitfor delay '00:00:05'

UPDATE  ticket set ticketcount=@count-1


commit tran

select * from ticket