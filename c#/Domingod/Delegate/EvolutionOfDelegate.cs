using System;

using Xunit;
using Xunit.Abstractions;

namespace Dmingod{


public class EvolutionOfDelegate{
     private  readonly ITestOutputHelper output;  
      delegate void nopara();
      public EvolutionOfDelegate(ITestOutputHelper testOutput){
         this.output=testOutput;
      }

     
     
       [Fact]
        public void TestName()  {
          //Given
          output.WriteLine("{0}",333); 
          Assert.True(1==2);
          { 
            nopara s=new nopara(TestName);
          }
        }


    }
}