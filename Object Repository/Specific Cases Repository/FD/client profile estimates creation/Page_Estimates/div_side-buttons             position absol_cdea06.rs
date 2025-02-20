<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_side-buttons             position absol_cdea06</name>
   <tag></tag>
   <elementGuidId>cbddc40a-00c5-4f8d-9af0-546620f2db57</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='Dismiss'])[2]/following::div[1]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.container-content.ls-content-wrapper</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:text=&quot;chevron_left homepage chevron_left Back to Profile Estimate #45 for E Client E A&quot;i</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>496b5588-46e5-4155-a96e-ffdf6c2e394b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>container-content ls-content-wrapper</value>
      <webElementGuid>b1517c60-e4a1-41fe-a24f-fb9e0126027a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
    
    
    
    
        .side-buttons {
            position: absolute;
            top: 0;
            left: 0;
            bottom: 0;
            width: 30px;
            background: #DCE0EA;
            flex-direction: column;
            align-items: center;
            min-width: 30px;
            padding-top: 16px;
            text-decoration: none;
            display: none;
            gap: 20px;
        }

        .side-buttons span:not(.btn-text) {
            color: var(--theme-main-dark);
            font-size: 16px;
            opacity: .6
        }

        span.btn-text {
            margin-top: 16px;
            text-transform: uppercase;
            color: var(--theme-main-dark);
            font-family: Roboto, bold, sans-serif;
            font-weight: bold;
            writing-mode: tb-rl;
            transform: rotate(-180deg);
            font-size: 10px;
            opacity: .6
        }

        .side-buttons a {
            display: flex;
            flex-direction: column;
            align-items: center;
            text-decoration: none;
        }
    
    
        
            chevron_left
            homepage
        
                    
                chevron_left
                Back to Profile
            
                

    
    
        $(document).ready(function () {
            $('.ls-content-wrapper').css('padding-left', '60px');
            $('.side-buttons').css('display', 'flex');
        });
    
            

    
                
                

        Estimate #45
        
            
                for E Client E Automation
            
        

        Estimate for E Client E Automation

        
        
        
        

        
            

                
                     
                

                
  
        Payor:--not-selected--Scholarship
      



  
    Description:
  
      
      Admission Fee:
    
    
    Is this payor under contract?--not-selected--YesNoUnknown
  



  
    Individual Deductible
  
  
    Deductible Met:
  
  
    Life Max:
  
  
    Life Met:
  
  
    Deductible included in OOP?Not SelectedYesNo
  


  
    In Network: Individual Maximum Out of Pocket:
  
  
    In Network: Indiviual Out of Pocket Met YTD:
  
  
    In Network: Family Maximum Out of Pocket:
  
  
    In Network: Family Out of Pocket Met YTD:
  




  
    Out-of-Network: Individual Maximum Out of Pocket::
  
  
    Out-of-Network: Individual Out of Pocket Met YTD:
  
  
    Out-of-Network: Family Maximum Out of Pocket:
  
  
    Out-of-Network: Family Out of Pocket Met YTD:
  




Services
 
    
      
        
          Service
          Rate Type
          Unit Cost
          Sessions
          Total Cost
          Unit Copay/Coinsurance
          Total Copay/Coinsurance
          Hardship
          Ded.Applied?
          Est. Client
          Est. Ins
          Ded. Rem
        
      
      
            
      
      
              
          Admission Fee
          $1.10
          --
          --
          --
          
          $1.10
          --
          --
        
              
          TOTAL
          $1.10
          
          
          $0.00
          
          $1.10
          $0.00
          $-1.10
        
        
                    
                         SERVICE
                      
                  
    
        
    
 













  
    Note:
  



  
    
    
    
    
    
  

    
    
       Payment will be made by someone other than the client
    
  


  
    
        Payment will be made by someone other than the client
    
  
  
   

  
        
      
        
        
          
          
        
        
          Name:
        
      
    
      




       


windowReady.then(function () {

  if(document.querySelector('#btnshowpin')){
    document.querySelector('#btnshowpin').onclick = function () {
      var isvisible = $(&quot;#pin&quot;).is(&quot;:visible&quot;);
      if (isvisible == true) {
        document.querySelector('#pin').value = '';
        document.querySelector('#pin').hideItem();
      } else {
        document.querySelector('#pin').showItem();
        document.querySelector('#pin').value = '';
      }
    };
  }

  if(document.querySelector('#pin')){
    document.querySelector('#pin').onkeyup = function () {
      if (document.querySelector('#pin').value.length == 4) {
        sendpin();
      }
      if (document.querySelector('#pin').value.length > 4) {
        alert('PIN is only 4 characters');
      }
    };
  }
});

function sendpin() {
  $.ajaxSetup({
    headers: {
      'X-CSRF-TOKEN': $('meta[name=&quot;csrf-token&quot;]').attr('content')
    }
  });
  var pin = document.querySelector('#pin').value;
  var inquiry_id = document.querySelector('#inquiry_id').value;
  $.ajax({
    url: '/sig/verifypin',
    type: 'POST',
    data: {
      'inquiry_id': inquiry_id,
      'pin': pin,
      '_token': document.querySelector('input[name=_token]').value
    },
    success: function (data) {
      console.log(data);
      var pin_id = data.pin_id;
      var pin_error = data.error;
      if (pin_error == null) {
        document.querySelector('#pincheckmsg').innerHTML = 'Verified!'
        document.querySelector('#pin_id').value = pin_id;
      } else {
        document.querySelector('#pincheckmsg').innerHTML = 'Invalid Entry'
        document.querySelector('#pin_id').value = 0;
        alert(pin_error);

      }
    }
  })
  return true;
}

  
    
      
      
        
        E Client E Automation
      
    
  
    
      




  Staff Signature
  
    
      
      
      
        Sign with Signature on File
        Signature will not be added unless client has already signed.
    
  



 


  
    Created on 02/20/2025 by Automation Test
  



    
    
      
        
           Entered in Error
        
      
      This removes the record. It is not reversible.
    
  
  
                
                    
                        
                            Save
                        
                    
                                        
                        
                                                                                     Save &amp; Send to Portal 
                                                                                
                    
                                                            
                        
                             Cancel
                        
                    
                                    
                
    
        

            
                ×
                Send Estimate to Portal
            

            
            


                
                    
                    
                        
                            
                            
                             Don't send Email
                    
                    
                
                
                
                    Estimate will be linked to the First Email on List
                     
                        
                        
                            
                            1
                            
                                
                                    Recipient
                                    
                                        
                                            
                                            
                                        
                                    
                                
                            
                            
                            
                        
                        
                     
                
                
                
                    Add Email
                    Delete Email
                
                
            

            
                 Cancel
                Send Email
            
            
        
    



document.addEventListener('DOMContentLoaded', function() {
    var i = 1;
    $(&quot;#portaladd_row&quot;).click(function () {
        b = i - 1;
        $('#portaladdr' + i).html($('#portaladdr' + b).html()).find('td:first-child').html(i + 1);
        $('#portal_recipients').append('&lt;tr id=&quot;portaladdr' + (i + 1) + '&quot;>&lt;/tr>');
        i++;
    });
    $(&quot;#portaldelete_row&quot;).click(function () {
        if (i > 1) {
            $(&quot;#portaladdr&quot; + (i - 1)).html('');
            i--;
        }
    });

    $('#portalModal').on('shown.bs.modal', function () {
        $('#sendPortalButton').focus();
    });

    $('#no_email').on('click', function() {
        if($(this).is(':checked')) {
            $('#send_email').hide();
            $('#email_buttons').hide();
            $('#sendPortalButton').html('Send to Portal');
        } else {
            $('#send_email').show();
            $('#email_buttons').show();
            $('#sendPortalButton').html('Send Email');
        }
    });

});
function showPortalEmailModal() {
    let email = &quot;eautomation@lightningstep.com&quot;;
    $('#portalrecipients').val(email);
    $('#portalModal').modal('show');
}

function submitAction(value) {
    $('#action').val(value);
    $('#formEstimate').submit();
}



                
                 
            
        

        
        
            
                
                    
                        ×
                        Estimate Service
                    

                    

                        

                            

                            
                                
                                    Service:-- Please select --5 Panel Drug ScreenAssessmentauutomation service testDetoxificationIndividual SessionInpatient ResidentialIntroduction Of Cardiac Pacemaker System Via VeinIOPNebulizer TherapyOutpatientTake Backtest automation
                                
                                
                                    Rate Type:Self PayPatient ResponsibilityInsurance
                                
                            

                            
                                
                                    # of Units/Sessions:
                                
                                
                                    Unit Cost:
                                

                                
                                    Total Cost:
                                

                            

                            
                                
                                    Copay/Co-insCopaymentCo-insurance
                                

                                
                                    Copay Amount:
                                

                                
                                    Coinsurance %:
                                

                                
                                    Hardship:
                                

                            
                            
                                
                                     Apply Deductible?
                                
                            


                            
                                
                                    Note:
                                
                            

                            
                                
                                     Entered in Error
                                
                            


                            
                        
                        
                            Add
                             Cancel
                        
                    

                    
                
            
        
    



    </value>
      <webElementGuid>ec365ff4-9455-4438-8866-6826b18a0b23</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;tablesaw-enhanced ls-light&quot;]/body[1]/div[@class=&quot;container-content ls-content-wrapper&quot;]</value>
      <webElementGuid>b486ae82-e2ba-4b53-8dce-ff9ad4f79f4e</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Dismiss'])[2]/following::div[1]</value>
      <webElementGuid>e219194c-55b0-4dba-9508-59ab2dafc9f6</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='About'])[3]/following::div[3]</value>
      <webElementGuid>2bff71b1-ae35-478d-94ef-7e37ffb82125</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[11]</value>
      <webElementGuid>c146523e-3d63-4ea3-862b-b405ef44e5c4</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
    
    
    
    
    
        .side-buttons {
            position: absolute;
            top: 0;
            left: 0;
            bottom: 0;
            width: 30px;
            background: #DCE0EA;
            flex-direction: column;
            align-items: center;
            min-width: 30px;
            padding-top: 16px;
            text-decoration: none;
            display: none;
            gap: 20px;
        }

        .side-buttons span:not(.btn-text) {
            color: var(--theme-main-dark);
            font-size: 16px;
            opacity: .6
        }

        span.btn-text {
            margin-top: 16px;
            text-transform: uppercase;
            color: var(--theme-main-dark);
            font-family: Roboto, bold, sans-serif;
            font-weight: bold;
            writing-mode: tb-rl;
            transform: rotate(-180deg);
            font-size: 10px;
            opacity: .6
        }

        .side-buttons a {
            display: flex;
            flex-direction: column;
            align-items: center;
            text-decoration: none;
        }
    
    
        
            chevron_left
            homepage
        
                    
                chevron_left
                Back to Profile
            
                

    
    
        $(document).ready(function () {
            $(&quot; , &quot;'&quot; , &quot;.ls-content-wrapper&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;padding-left&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;60px&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;.side-buttons&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;display&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;flex&quot; , &quot;'&quot; , &quot;);
        });
    
            

    
                
                

        Estimate #45
        
            
                for E Client E Automation
            
        

        Estimate for E Client E Automation

        
        
        
        

        
            

                
                     
                

                
  
        Payor:--not-selected--Scholarship
      



  
    Description:
  
      
      Admission Fee:
    
    
    Is this payor under contract?--not-selected--YesNoUnknown
  



  
    Individual Deductible
  
  
    Deductible Met:
  
  
    Life Max:
  
  
    Life Met:
  
  
    Deductible included in OOP?Not SelectedYesNo
  


  
    In Network: Individual Maximum Out of Pocket:
  
  
    In Network: Indiviual Out of Pocket Met YTD:
  
  
    In Network: Family Maximum Out of Pocket:
  
  
    In Network: Family Out of Pocket Met YTD:
  




  
    Out-of-Network: Individual Maximum Out of Pocket::
  
  
    Out-of-Network: Individual Out of Pocket Met YTD:
  
  
    Out-of-Network: Family Maximum Out of Pocket:
  
  
    Out-of-Network: Family Out of Pocket Met YTD:
  




Services
 
    
      
        
          Service
          Rate Type
          Unit Cost
          Sessions
          Total Cost
          Unit Copay/Coinsurance
          Total Copay/Coinsurance
          Hardship
          Ded.Applied?
          Est. Client
          Est. Ins
          Ded. Rem
        
      
      
            
      
      
              
          Admission Fee
          $1.10
          --
          --
          --
          
          $1.10
          --
          --
        
              
          TOTAL
          $1.10
          
          
          $0.00
          
          $1.10
          $0.00
          $-1.10
        
        
                    
                         SERVICE
                      
                  
    
        
    
 













  
    Note:
  



  
    
    
    
    
    
  

    
    
       Payment will be made by someone other than the client
    
  


  
    
        Payment will be made by someone other than the client
    
  
  
   

  
        
      
        
        
          
          
        
        
          Name:
        
      
    
      




       


windowReady.then(function () {

  if(document.querySelector(&quot; , &quot;'&quot; , &quot;#btnshowpin&quot; , &quot;'&quot; , &quot;)){
    document.querySelector(&quot; , &quot;'&quot; , &quot;#btnshowpin&quot; , &quot;'&quot; , &quot;).onclick = function () {
      var isvisible = $(&quot;#pin&quot;).is(&quot;:visible&quot;);
      if (isvisible == true) {
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).hideItem();
      } else {
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).showItem();
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
      }
    };
  }

  if(document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;)){
    document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).onkeyup = function () {
      if (document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value.length == 4) {
        sendpin();
      }
      if (document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value.length > 4) {
        alert(&quot; , &quot;'&quot; , &quot;PIN is only 4 characters&quot; , &quot;'&quot; , &quot;);
      }
    };
  }
});

function sendpin() {
  $.ajaxSetup({
    headers: {
      &quot; , &quot;'&quot; , &quot;X-CSRF-TOKEN&quot; , &quot;'&quot; , &quot;: $(&quot; , &quot;'&quot; , &quot;meta[name=&quot;csrf-token&quot;]&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;content&quot; , &quot;'&quot; , &quot;)
    }
  });
  var pin = document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value;
  var inquiry_id = document.querySelector(&quot; , &quot;'&quot; , &quot;#inquiry_id&quot; , &quot;'&quot; , &quot;).value;
  $.ajax({
    url: &quot; , &quot;'&quot; , &quot;/sig/verifypin&quot; , &quot;'&quot; , &quot;,
    type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
    data: {
      &quot; , &quot;'&quot; , &quot;inquiry_id&quot; , &quot;'&quot; , &quot;: inquiry_id,
      &quot; , &quot;'&quot; , &quot;pin&quot; , &quot;'&quot; , &quot;: pin,
      &quot; , &quot;'&quot; , &quot;_token&quot; , &quot;'&quot; , &quot;: document.querySelector(&quot; , &quot;'&quot; , &quot;input[name=_token]&quot; , &quot;'&quot; , &quot;).value
    },
    success: function (data) {
      console.log(data);
      var pin_id = data.pin_id;
      var pin_error = data.error;
      if (pin_error == null) {
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pincheckmsg&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;Verified!&quot; , &quot;'&quot; , &quot;
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin_id&quot; , &quot;'&quot; , &quot;).value = pin_id;
      } else {
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pincheckmsg&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;Invalid Entry&quot; , &quot;'&quot; , &quot;
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin_id&quot; , &quot;'&quot; , &quot;).value = 0;
        alert(pin_error);

      }
    }
  })
  return true;
}

  
    
      
      
        
        E Client E Automation
      
    
  
    
      




  Staff Signature
  
    
      
      
      
        Sign with Signature on File
        Signature will not be added unless client has already signed.
    
  



 


  
    Created on 02/20/2025 by Automation Test
  



    
    
      
        
           Entered in Error
        
      
      This removes the record. It is not reversible.
    
  
  
                
                    
                        
                            Save
                        
                    
                                        
                        
                                                                                     Save &amp; Send to Portal 
                                                                                
                    
                                                            
                        
                             Cancel
                        
                    
                                    
                
    
        

            
                ×
                Send Estimate to Portal
            

            
            


                
                    
                    
                        
                            
                            
                             Don&quot; , &quot;'&quot; , &quot;t send Email
                    
                    
                
                
                
                    Estimate will be linked to the First Email on List
                     
                        
                        
                            
                            1
                            
                                
                                    Recipient
                                    
                                        
                                            
                                            
                                        
                                    
                                
                            
                            
                            
                        
                        
                     
                
                
                
                    Add Email
                    Delete Email
                
                
            

            
                 Cancel
                Send Email
            
            
        
    



document.addEventListener(&quot; , &quot;'&quot; , &quot;DOMContentLoaded&quot; , &quot;'&quot; , &quot;, function() {
    var i = 1;
    $(&quot;#portaladd_row&quot;).click(function () {
        b = i - 1;
        $(&quot; , &quot;'&quot; , &quot;#portaladdr&quot; , &quot;'&quot; , &quot; + i).html($(&quot; , &quot;'&quot; , &quot;#portaladdr&quot; , &quot;'&quot; , &quot; + b).html()).find(&quot; , &quot;'&quot; , &quot;td:first-child&quot; , &quot;'&quot; , &quot;).html(i + 1);
        $(&quot; , &quot;'&quot; , &quot;#portal_recipients&quot; , &quot;'&quot; , &quot;).append(&quot; , &quot;'&quot; , &quot;&lt;tr id=&quot;portaladdr&quot; , &quot;'&quot; , &quot; + (i + 1) + &quot; , &quot;'&quot; , &quot;&quot;>&lt;/tr>&quot; , &quot;'&quot; , &quot;);
        i++;
    });
    $(&quot;#portaldelete_row&quot;).click(function () {
        if (i > 1) {
            $(&quot;#portaladdr&quot; + (i - 1)).html(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            i--;
        }
    });

    $(&quot; , &quot;'&quot; , &quot;#portalModal&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;shown.bs.modal&quot; , &quot;'&quot; , &quot;, function () {
        $(&quot; , &quot;'&quot; , &quot;#sendPortalButton&quot; , &quot;'&quot; , &quot;).focus();
    });

    $(&quot; , &quot;'&quot; , &quot;#no_email&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function() {
        if($(this).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;)) {
            $(&quot; , &quot;'&quot; , &quot;#send_email&quot; , &quot;'&quot; , &quot;).hide();
            $(&quot; , &quot;'&quot; , &quot;#email_buttons&quot; , &quot;'&quot; , &quot;).hide();
            $(&quot; , &quot;'&quot; , &quot;#sendPortalButton&quot; , &quot;'&quot; , &quot;).html(&quot; , &quot;'&quot; , &quot;Send to Portal&quot; , &quot;'&quot; , &quot;);
        } else {
            $(&quot; , &quot;'&quot; , &quot;#send_email&quot; , &quot;'&quot; , &quot;).show();
            $(&quot; , &quot;'&quot; , &quot;#email_buttons&quot; , &quot;'&quot; , &quot;).show();
            $(&quot; , &quot;'&quot; , &quot;#sendPortalButton&quot; , &quot;'&quot; , &quot;).html(&quot; , &quot;'&quot; , &quot;Send Email&quot; , &quot;'&quot; , &quot;);
        }
    });

});
function showPortalEmailModal() {
    let email = &quot;eautomation@lightningstep.com&quot;;
    $(&quot; , &quot;'&quot; , &quot;#portalrecipients&quot; , &quot;'&quot; , &quot;).val(email);
    $(&quot; , &quot;'&quot; , &quot;#portalModal&quot; , &quot;'&quot; , &quot;).modal(&quot; , &quot;'&quot; , &quot;show&quot; , &quot;'&quot; , &quot;);
}

function submitAction(value) {
    $(&quot; , &quot;'&quot; , &quot;#action&quot; , &quot;'&quot; , &quot;).val(value);
    $(&quot; , &quot;'&quot; , &quot;#formEstimate&quot; , &quot;'&quot; , &quot;).submit();
}



                
                 
            
        

        
        
            
                
                    
                        ×
                        Estimate Service
                    

                    

                        

                            

                            
                                
                                    Service:-- Please select --5 Panel Drug ScreenAssessmentauutomation service testDetoxificationIndividual SessionInpatient ResidentialIntroduction Of Cardiac Pacemaker System Via VeinIOPNebulizer TherapyOutpatientTake Backtest automation
                                
                                
                                    Rate Type:Self PayPatient ResponsibilityInsurance
                                
                            

                            
                                
                                    # of Units/Sessions:
                                
                                
                                    Unit Cost:
                                

                                
                                    Total Cost:
                                

                            

                            
                                
                                    Copay/Co-insCopaymentCo-insurance
                                

                                
                                    Copay Amount:
                                

                                
                                    Coinsurance %:
                                

                                
                                    Hardship:
                                

                            
                            
                                
                                     Apply Deductible?
                                
                            


                            
                                
                                    Note:
                                
                            

                            
                                
                                     Entered in Error
                                
                            


                            
                        
                        
                            Add
                             Cancel
                        
                    

                    
                
            
        
    



    &quot;) or . = concat(&quot;
    
    
    
    
    
        .side-buttons {
            position: absolute;
            top: 0;
            left: 0;
            bottom: 0;
            width: 30px;
            background: #DCE0EA;
            flex-direction: column;
            align-items: center;
            min-width: 30px;
            padding-top: 16px;
            text-decoration: none;
            display: none;
            gap: 20px;
        }

        .side-buttons span:not(.btn-text) {
            color: var(--theme-main-dark);
            font-size: 16px;
            opacity: .6
        }

        span.btn-text {
            margin-top: 16px;
            text-transform: uppercase;
            color: var(--theme-main-dark);
            font-family: Roboto, bold, sans-serif;
            font-weight: bold;
            writing-mode: tb-rl;
            transform: rotate(-180deg);
            font-size: 10px;
            opacity: .6
        }

        .side-buttons a {
            display: flex;
            flex-direction: column;
            align-items: center;
            text-decoration: none;
        }
    
    
        
            chevron_left
            homepage
        
                    
                chevron_left
                Back to Profile
            
                

    
    
        $(document).ready(function () {
            $(&quot; , &quot;'&quot; , &quot;.ls-content-wrapper&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;padding-left&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;60px&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;.side-buttons&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;display&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;flex&quot; , &quot;'&quot; , &quot;);
        });
    
            

    
                
                

        Estimate #45
        
            
                for E Client E Automation
            
        

        Estimate for E Client E Automation

        
        
        
        

        
            

                
                     
                

                
  
        Payor:--not-selected--Scholarship
      



  
    Description:
  
      
      Admission Fee:
    
    
    Is this payor under contract?--not-selected--YesNoUnknown
  



  
    Individual Deductible
  
  
    Deductible Met:
  
  
    Life Max:
  
  
    Life Met:
  
  
    Deductible included in OOP?Not SelectedYesNo
  


  
    In Network: Individual Maximum Out of Pocket:
  
  
    In Network: Indiviual Out of Pocket Met YTD:
  
  
    In Network: Family Maximum Out of Pocket:
  
  
    In Network: Family Out of Pocket Met YTD:
  




  
    Out-of-Network: Individual Maximum Out of Pocket::
  
  
    Out-of-Network: Individual Out of Pocket Met YTD:
  
  
    Out-of-Network: Family Maximum Out of Pocket:
  
  
    Out-of-Network: Family Out of Pocket Met YTD:
  




Services
 
    
      
        
          Service
          Rate Type
          Unit Cost
          Sessions
          Total Cost
          Unit Copay/Coinsurance
          Total Copay/Coinsurance
          Hardship
          Ded.Applied?
          Est. Client
          Est. Ins
          Ded. Rem
        
      
      
            
      
      
              
          Admission Fee
          $1.10
          --
          --
          --
          
          $1.10
          --
          --
        
              
          TOTAL
          $1.10
          
          
          $0.00
          
          $1.10
          $0.00
          $-1.10
        
        
                    
                         SERVICE
                      
                  
    
        
    
 













  
    Note:
  



  
    
    
    
    
    
  

    
    
       Payment will be made by someone other than the client
    
  


  
    
        Payment will be made by someone other than the client
    
  
  
   

  
        
      
        
        
          
          
        
        
          Name:
        
      
    
      




       


windowReady.then(function () {

  if(document.querySelector(&quot; , &quot;'&quot; , &quot;#btnshowpin&quot; , &quot;'&quot; , &quot;)){
    document.querySelector(&quot; , &quot;'&quot; , &quot;#btnshowpin&quot; , &quot;'&quot; , &quot;).onclick = function () {
      var isvisible = $(&quot;#pin&quot;).is(&quot;:visible&quot;);
      if (isvisible == true) {
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).hideItem();
      } else {
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).showItem();
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
      }
    };
  }

  if(document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;)){
    document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).onkeyup = function () {
      if (document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value.length == 4) {
        sendpin();
      }
      if (document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value.length > 4) {
        alert(&quot; , &quot;'&quot; , &quot;PIN is only 4 characters&quot; , &quot;'&quot; , &quot;);
      }
    };
  }
});

function sendpin() {
  $.ajaxSetup({
    headers: {
      &quot; , &quot;'&quot; , &quot;X-CSRF-TOKEN&quot; , &quot;'&quot; , &quot;: $(&quot; , &quot;'&quot; , &quot;meta[name=&quot;csrf-token&quot;]&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;content&quot; , &quot;'&quot; , &quot;)
    }
  });
  var pin = document.querySelector(&quot; , &quot;'&quot; , &quot;#pin&quot; , &quot;'&quot; , &quot;).value;
  var inquiry_id = document.querySelector(&quot; , &quot;'&quot; , &quot;#inquiry_id&quot; , &quot;'&quot; , &quot;).value;
  $.ajax({
    url: &quot; , &quot;'&quot; , &quot;/sig/verifypin&quot; , &quot;'&quot; , &quot;,
    type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
    data: {
      &quot; , &quot;'&quot; , &quot;inquiry_id&quot; , &quot;'&quot; , &quot;: inquiry_id,
      &quot; , &quot;'&quot; , &quot;pin&quot; , &quot;'&quot; , &quot;: pin,
      &quot; , &quot;'&quot; , &quot;_token&quot; , &quot;'&quot; , &quot;: document.querySelector(&quot; , &quot;'&quot; , &quot;input[name=_token]&quot; , &quot;'&quot; , &quot;).value
    },
    success: function (data) {
      console.log(data);
      var pin_id = data.pin_id;
      var pin_error = data.error;
      if (pin_error == null) {
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pincheckmsg&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;Verified!&quot; , &quot;'&quot; , &quot;
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin_id&quot; , &quot;'&quot; , &quot;).value = pin_id;
      } else {
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pincheckmsg&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;Invalid Entry&quot; , &quot;'&quot; , &quot;
        document.querySelector(&quot; , &quot;'&quot; , &quot;#pin_id&quot; , &quot;'&quot; , &quot;).value = 0;
        alert(pin_error);

      }
    }
  })
  return true;
}

  
    
      
      
        
        E Client E Automation
      
    
  
    
      




  Staff Signature
  
    
      
      
      
        Sign with Signature on File
        Signature will not be added unless client has already signed.
    
  



 


  
    Created on 02/20/2025 by Automation Test
  



    
    
      
        
           Entered in Error
        
      
      This removes the record. It is not reversible.
    
  
  
                
                    
                        
                            Save
                        
                    
                                        
                        
                                                                                     Save &amp; Send to Portal 
                                                                                
                    
                                                            
                        
                             Cancel
                        
                    
                                    
                
    
        

            
                ×
                Send Estimate to Portal
            

            
            


                
                    
                    
                        
                            
                            
                             Don&quot; , &quot;'&quot; , &quot;t send Email
                    
                    
                
                
                
                    Estimate will be linked to the First Email on List
                     
                        
                        
                            
                            1
                            
                                
                                    Recipient
                                    
                                        
                                            
                                            
                                        
                                    
                                
                            
                            
                            
                        
                        
                     
                
                
                
                    Add Email
                    Delete Email
                
                
            

            
                 Cancel
                Send Email
            
            
        
    



document.addEventListener(&quot; , &quot;'&quot; , &quot;DOMContentLoaded&quot; , &quot;'&quot; , &quot;, function() {
    var i = 1;
    $(&quot;#portaladd_row&quot;).click(function () {
        b = i - 1;
        $(&quot; , &quot;'&quot; , &quot;#portaladdr&quot; , &quot;'&quot; , &quot; + i).html($(&quot; , &quot;'&quot; , &quot;#portaladdr&quot; , &quot;'&quot; , &quot; + b).html()).find(&quot; , &quot;'&quot; , &quot;td:first-child&quot; , &quot;'&quot; , &quot;).html(i + 1);
        $(&quot; , &quot;'&quot; , &quot;#portal_recipients&quot; , &quot;'&quot; , &quot;).append(&quot; , &quot;'&quot; , &quot;&lt;tr id=&quot;portaladdr&quot; , &quot;'&quot; , &quot; + (i + 1) + &quot; , &quot;'&quot; , &quot;&quot;>&lt;/tr>&quot; , &quot;'&quot; , &quot;);
        i++;
    });
    $(&quot;#portaldelete_row&quot;).click(function () {
        if (i > 1) {
            $(&quot;#portaladdr&quot; + (i - 1)).html(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            i--;
        }
    });

    $(&quot; , &quot;'&quot; , &quot;#portalModal&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;shown.bs.modal&quot; , &quot;'&quot; , &quot;, function () {
        $(&quot; , &quot;'&quot; , &quot;#sendPortalButton&quot; , &quot;'&quot; , &quot;).focus();
    });

    $(&quot; , &quot;'&quot; , &quot;#no_email&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function() {
        if($(this).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;)) {
            $(&quot; , &quot;'&quot; , &quot;#send_email&quot; , &quot;'&quot; , &quot;).hide();
            $(&quot; , &quot;'&quot; , &quot;#email_buttons&quot; , &quot;'&quot; , &quot;).hide();
            $(&quot; , &quot;'&quot; , &quot;#sendPortalButton&quot; , &quot;'&quot; , &quot;).html(&quot; , &quot;'&quot; , &quot;Send to Portal&quot; , &quot;'&quot; , &quot;);
        } else {
            $(&quot; , &quot;'&quot; , &quot;#send_email&quot; , &quot;'&quot; , &quot;).show();
            $(&quot; , &quot;'&quot; , &quot;#email_buttons&quot; , &quot;'&quot; , &quot;).show();
            $(&quot; , &quot;'&quot; , &quot;#sendPortalButton&quot; , &quot;'&quot; , &quot;).html(&quot; , &quot;'&quot; , &quot;Send Email&quot; , &quot;'&quot; , &quot;);
        }
    });

});
function showPortalEmailModal() {
    let email = &quot;eautomation@lightningstep.com&quot;;
    $(&quot; , &quot;'&quot; , &quot;#portalrecipients&quot; , &quot;'&quot; , &quot;).val(email);
    $(&quot; , &quot;'&quot; , &quot;#portalModal&quot; , &quot;'&quot; , &quot;).modal(&quot; , &quot;'&quot; , &quot;show&quot; , &quot;'&quot; , &quot;);
}

function submitAction(value) {
    $(&quot; , &quot;'&quot; , &quot;#action&quot; , &quot;'&quot; , &quot;).val(value);
    $(&quot; , &quot;'&quot; , &quot;#formEstimate&quot; , &quot;'&quot; , &quot;).submit();
}



                
                 
            
        

        
        
            
                
                    
                        ×
                        Estimate Service
                    

                    

                        

                            

                            
                                
                                    Service:-- Please select --5 Panel Drug ScreenAssessmentauutomation service testDetoxificationIndividual SessionInpatient ResidentialIntroduction Of Cardiac Pacemaker System Via VeinIOPNebulizer TherapyOutpatientTake Backtest automation
                                
                                
                                    Rate Type:Self PayPatient ResponsibilityInsurance
                                
                            

                            
                                
                                    # of Units/Sessions:
                                
                                
                                    Unit Cost:
                                

                                
                                    Total Cost:
                                

                            

                            
                                
                                    Copay/Co-insCopaymentCo-insurance
                                

                                
                                    Copay Amount:
                                

                                
                                    Coinsurance %:
                                

                                
                                    Hardship:
                                

                            
                            
                                
                                     Apply Deductible?
                                
                            


                            
                                
                                    Note:
                                
                            

                            
                                
                                     Entered in Error
                                
                            


                            
                        
                        
                            Add
                             Cancel
                        
                    

                    
                
            
        
    



    &quot;))]</value>
      <webElementGuid>c4ccff65-9e2f-45fb-8506-a7e00232b61e</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
