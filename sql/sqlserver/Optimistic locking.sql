declare @count as int
declare @flag as timestamp
declare @rowcount as int

begin tran

select @count=ticketCount,@flag=TimeFlag  from  Ticket 

waitfor delay '00:00:05'

UPDATE  ticket set ticketcount=@count-1  where TimeFlag=@flag

set @rowcount=@@ROWCOUNT
if @rowcount>0
print 'update success'
else 
begin 
print 'update  falure  and trying  redo'
select @count=ticketCount,@flag=TimeFlag  from  Ticket 
UPDATE  ticket set ticketcount=@count-1  where TimeFlag=@flag
end 


commit tran
 

select * from ticket