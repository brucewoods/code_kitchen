 
  
  create proc LockProc  --乐观锁控制并发
  (
  @ProductId int,
  @IsSucess bit=0 output
  )
  as
  declare @count as int
  declare @flag as TimeStamp
  declare @rowcount as int
  begin tran
  select @count=ProductCount,@flag=VersionNum from Inventory  where ProductId=@ProductId
  
  update Inventory set ProductCount=@count-1 where  VersionNum=@flag and ProductId=@ProductId
  
  insert into InventoryLog values('Cocurrency happening')
  set @rowcount=@@ROWCOUNT
  if @rowcount>0
  set @IsSucess=1  ---正常更新
  else
  set @IsSucess=0  ---触发并发
  commit tran
  
  
  