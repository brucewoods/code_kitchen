//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ConcurrentModifyingData.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class Inventory
    {
        public int InventoryId { get; set; }
        public Nullable<int> ProductId { get; set; }
        public Nullable<int> ProductCount { get; set; }
        public byte[] VersionNum { get; set; }
        public Nullable<System.DateTime> InventoryTime { get; set; }
    
        public virtual Product Product { get; set; }
    }
}
