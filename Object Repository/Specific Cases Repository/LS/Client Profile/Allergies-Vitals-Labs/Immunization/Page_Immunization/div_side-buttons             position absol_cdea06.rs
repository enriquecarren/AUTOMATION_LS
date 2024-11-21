<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_side-buttons             position absol_cdea06</name>
   <tag></tag>
   <elementGuidId>e4518cb8-0677-4767-8abf-02a16eb33481</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='immunization.create']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:text=&quot;chevron_left homepage chevron_left Back to Profile Immunization for A Client A A&quot;i</value>
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
      <webElementGuid>74f874d0-c1f4-45f0-9624-298cfd96d79c</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>container-content ls-content-wrapper</value>
      <webElementGuid>27348151-f916-435f-b3b9-9fc32e2caa75</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>immunization.create</value>
      <webElementGuid>e616b4b2-93f6-465d-8dc0-72d4f0f2ab60</webElementGuid>
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
    
        
        
            












    
        Immunization for A Client A Automation
        DOB: 01/01/2000   MR#: 24-11006
    
    
        
         Print
    



    
        
        
            
                
                    
                        
                                
                                                                                                                                                                                             
                                                 
                        
                            
                                
                                                                                                                                                                                    Disease 
                                    Disease-- Please Select --AdenovirusAnthraxCholeraCOVID-19DiphtheriaHepatitis AHepatitis BHaemophilus influenzae type b (Hib)Human Papillomavirus (HPV)Seasonal Influenza (Flu) onlyJapanese EncephalitisMeaslesMeningococcalMumpsPertussisPneumococcalPolioRabiesRotavirusRubellaShinglesSmallpoxTetanusTuberculosisTyphoid FeverVaricellaYellow FeverAnthrax-- Please Select -- 
                                
                                
                                    
                                         
                                        
                                                                            
                                
                            
                        
                        
                            Disease
                                                        
                                                    
                                                
        
            
                                 
                                            
            
     
                
                    
                        
                                
                                                                                                                                                                                             
                                                 
                        
                            
                                
                                                                                                                                                                                    Manufacturer 
                                    Manufacturer-- Please Select --Barr Labs Inc.bioCSLDynavax TechnologiesEmergent BioSolutionsGlaxoSmithKlineJanssen (J&amp;J)Massachusetts Biological LabsMedImmuneMerckModernaPaxVaxPfizersanofiSeqirusValnevaDynavax Technologies-- Please Select -- 
                                
                                
                                    
                                         
                                        
                                                                            
                                
                            
                        
                        
                            Manufacturer
                                                        
                                                    
                                                
        
            
                                 
                                            
            
     
                
                    
                        
                                
                        Dose #1 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                            Vaccine:
                    
    
    ×adenovirus vaccine, type 4, live, oral
     Vaccine is required
    
    



    $( document ).ready(function() { 
        var vaccineInfoSpan = &quot;saved_vaccine_info&quot;;
        var oncVaccineElement = &quot;vaccine_onc_code_id&quot;;
        var vaccineElement = &quot;vaccine&quot;;

        var selectVaccineElementId = &quot;vaccine&quot;+&quot;_select&quot;;

        var select2VaccineObject = new Object;
        select2VaccineObject.placeholder = 'Select Vaccine';
        select2VaccineObject.allowClear = true;
        select2VaccineObject.templateResult = formatVaccineSelect;
        select2VaccineObject.templateSelection = formatVaccineSelection;
        select2VaccineObject.minimumInputLength = 2;
        select2VaccineObject.formatInputTooShort = function () {
                return &quot;Enter at least 2 characters&quot;;
        };
        select2VaccineObject.ajax = {
                url: &quot;/immunization/onc/getvaccine&quot;,
                dataType: 'json',
                delay: 150,
                data: function (params) {
                    return {
                        q: params.term, // search term
                        page: params.page
                    };
                },
                processResults: function (data, params) {
                    // parse the results into the format expected by Select2
                    // since we are using custom formatting functions we do not need to
                    // alter the remote JSON data, except to indicate that infinite
                    // scrolling can be used
                    params.page = params.page || 1;
                    return {
                        results: data.result,
                        pagination: {
                            more: (params.page * 30) &lt; data.length
                        }
                    };
                },
                // cache: true
            };
        
        // init select 2
        var select = $('#'+selectVaccineElementId).select2(select2VaccineObject);

        $('#'+selectVaccineElementId).next('span.select2-container').css(&quot;width&quot;, &quot;100%&quot;);

        $('.select2-selection__rendered').addClass('wraptext');

        $('#'+selectVaccineElementId).on('select2:open', function (e) {
            $('.select2-dropdown').removeClass('select2-dropdown--above').addClass('select2-dropdown--below');
        });

        $('#'+selectVaccineElementId).on(&quot;select2:select&quot;, function (e) { 
            resetSavedVaccineInfo();
            var vaccine = $('#'+selectVaccineElementId).select2('data')[0];
            $('#vaccine').val(vaccine);
            var oncVaccineElement = $(this).data('vaccine_onc_code_id_element');
            var vaccineElement = $(this).data('vaccine_element');
            $('#'+oncVaccineElement).val(vaccine.id);
            $('#'+vaccineElement).val(vaccine.description ?? vaccine.text);
            var holderName = &quot;&quot;+&quot;_vaccine_select_div_holder_&quot;+&quot;&quot;;
            $(holderName + &quot; .select2-selection--single&quot;).addClass('height100');
            $('#select2-'+selectVaccineElementId+'-container').parent('span').addClass('height100');
        });
        $('#'+selectVaccineElementId).on(&quot;select2:unselect&quot;, function (e) { 
            resetSavedVaccineInfo();
        });
        $('#'+selectVaccineElementId).on(&quot;select2:clear&quot;, function (e) { 
            resetSavedVaccineInfo();
        });

                
        function resetSavedVaccineInfo() {
            $('#vaccine').val('');
            $('#'+oncVaccineElement).val('');
            $('#'+vaccineElement).val('');
            $('#'+vaccineInfoSpan).html(&quot;&quot;);
            var holderName = &quot;&quot;+&quot;_vaccine_select_div_holder_&quot;+&quot;&quot;;
            $(holderName + &quot; .select2-selection--single&quot;).removeClass('height100');
            $('#select2-'+selectVaccineElementId+'-container').parent('span').removeClass('height100');
        }

        function formatVaccineSelect (repo) {
            if (repo.loading) {
                return repo.name;
            }

            var $container = $(
            &quot;&lt;div class='select2-result-repository clearfix'>&quot; +
                &quot;&lt;div class='select2-result-repository__name'>&lt;/div>&quot; +
                &quot;&lt;span id='infospan&quot;+repo.id+&quot;' class='select2-result-repository__infospan'>&lt;/span>&quot; +
                &quot;&lt;/div>&quot; +
                &quot;&lt;/div>&quot; +
            &quot;&lt;/div>&quot;
            );

            $container.find(&quot;.select2-result-repository__name&quot;).text(repo.description);
            $container.find(&quot;.select2-result-repository__name&quot;).val(repo.id);

            return $container;
        }

        function formatVaccineSelection (repo) {
            return repo.description;
        }

            });
                            
        
            
                                 
                                            
            
     
                
                    
                        
                                
                                        Date of Administration 
            
        
            
                                 
                                            
            
     
                
                    
                        
                                
                        Batch Expiration DateInvalid date 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                        Batch # 
            
        
            
                                 
                                            
            
     
                    
                            
                        
            
                
                    
                        
                                
                                        Vaccination-emergent adverse reactions (reported ESAVIs) 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                        Reason for not vaccinating (includes contraindications, history of ESAVI, etc.) 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                                                                            
                                 Did client have the disease?   Did client have the disease? 
            
        
            
                                 
                                            
            
     
                    
                            
                        
            
                
                    
                        
                                
                                        If yes, please explain 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                        Note 
            
        
            
                                
                            
    
 

    
        
            
                 Select File
                
            
        
    
    
        
                    
    


 






    $(document).ready(function() {

        $(&quot;#immunization_upload&quot;).on(&quot;change&quot;, function () {
            $('#saved_exdoc_holder').html('');
            var fileval = $(this).prop(&quot;files&quot;)[0]['name'];
            $('#selectedfile').html(fileval);
        });

        $('.updateother').on('change', function() {
            var dependent = $(this).data('dependent');
            var text = $(this).find('option:selected').text();
            $('#'+dependent).val(text);
        });

        $('body').delegate('.switchfield', 'change', function() {
            var val = $(this).val();
            var updatefield = $(this).data('update');
            $('#'+updatefield).val(val);
        });

        $('.switchselect').each(function() {
            var id = $(this).attr('id');
            updateSwitchElements(id, false);
        });

        $('body').delegate('.switchselect', 'click', function() {
            var id = $(this).attr('id');
            updateSwitchElements(id);
        });

        $('.hideshow').each(function() {
            var id = $(this).attr('id');
            updateHiddenField(id);
        });

        $('body').delegate('.hideshow', 'change', function() {
            var id = $(this).attr('id');
            updateHiddenField(id);
        });

                var thisId = &quot;disease&quot;;
        $('#'+thisId+'_select').select2({
            placeholder: '-Select-',
            allowClear: false,
            closeOnSelect: true,
            maximumSelected:1,
            theme: 'bootstrap',
            width: 'resolve'
        }); 
                var thisId = &quot;cvxcode&quot;;
        $('#'+thisId+'_select').select2({
            placeholder: '-Select-',
            allowClear: false,
            closeOnSelect: true,
            maximumSelected:1,
            theme: 'bootstrap',
            width: 'resolve'
        }); 
                var thisId = &quot;manufacturer&quot;;
        $('#'+thisId+'_select').select2({
            placeholder: '-Select-',
            allowClear: false,
            closeOnSelect: true,
            maximumSelected:1,
            theme: 'bootstrap',
            width: 'resolve'
        }); 
        
        function updateSwitchElements(id, isChange = true) {
            var select = $('#'+id).data('select');
            var selectElement = $('#'+select);
            var text = $('#'+id).data('text');
            var textElement = $('#'+text);
            var i = $('#'+id).find('i.fa');
            if(i.hasClass('fa-pencil')) {
                if(textElement.parent('div.form-group')) {
                    textElement.parent('div.form-group').show();
                } else {
                    textElement.show();
                }
                if(selectElement.parent('div.form-group')) {
                    selectElement.parent('div.form-group').hide();
                } else {
                    selectElement.hide();
                }
                i.removeClass('fa-pencil').addClass('fa-list');
                if(select == 'cvxcode_select' &amp;&amp; isChange) {
                    $('#vaccine').val('');
                    $('#cvxcode_text').val('');
                }
            } else {
                if(selectElement.parent('div.form-group')) {
                    selectElement.parent('div.form-group').show();
                } else {
                    selectElement.show();
                }
                if(textElement.parent('div.form-group')) {
                    textElement.parent('div.form-group').hide();
                } else {
                    textElement.hide();
                }
                i.removeClass('fa-list').addClass('fa-pencil');
                if(select == 'cvxcode_select' &amp;&amp; isChange) {
                    var text = selectElement.find('option:selected').text();
                    $('#vaccine').val(text);
                }
            }
        }

        function updateHiddenField(id) {
            var show = $('#'+id).data('show');
            var element = $('#'+show);
            if($('#'+id).is(':checked')) {
                if(element.parent('div.form-group')) {
                    element.parent('div.form-group').show();
                } else {
                    element.show();
                }
            } else {
                if(element.parent('div.form-group')) {
                    element.parent('div.form-group').hide();
                } else {
                    element.hide();
                }
            }
        }
    });


        

        
            
                
                    
                        
                        
                        Disease
                                    
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                        Manufacturer
                                    
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                            Dose #
                                    1
                            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
                        Vaccine
                                                        
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                                                    Date of Administration
                                    
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                                        Batch Expiration Date
                                    
                            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
                                                    Batch #
                                    
                            
        

                                 
                                            
            
        
        
                            
            
            
                
                    
                        
                        
         
                Vaccination-emergent adverse reactions (reported ESAVIs)
                
            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
         
                Reason for not vaccinating (includes contraindications, history of ESAVI, etc.)
                
            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
                            
                 
                     Did client have the disease?
                            
        

                                 
                                            
            
        
        
                            
            
            
                
                    
                        
                        
         
                If yes, please explain
                
            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
         
                Note
                
            
        

                                    
                            
    

        
        
        
            
                
                                
                
                
                
 


    $(document).ready(function () {
        $('body').delegate('#btnmainfrmsubmit, #btnmainfrmcancel, #btnmarkeie, .unfinalsave', 'click', function() {
            try {
                parent.closeIFrame();
            } catch {
                // No Catch. Assigns the med to a medq if it was triggered from the MAR
                // Otherwise, function does not exist
            }
        });

    });





    
        
            
            
    
        
        Sign and Lock
    
            
    






    
        
            You are set to have a QCC required, but you have no designated QCC set in User Administration.  An administrator can adjust your QCC setting in your User Administration profile.
        
    




 


 

    
         Save
        
    
    
                    
                 Cancel
            

                                    

            Creator / Last Editor Name - Automation Test
            
        
    
                    
            $('body').delegate('.btnSubmitToNext', 'click', function () {
                $(&quot;#hdnNextDssCheck&quot;).val($(this).data('doc_id')).prop('disabled', false).closest(&quot;form&quot;).submit();
            });
        
        
        
            You have other unsigned forms
            
            
                                                    
                        For Another Client:
                          Save And Open Next
                            Unsigned
                        
                    
                    
                        
                         Next
                    
                            
        
        
            
                            
        
    

    
            
        
        
        function showEieSection() {
            if (!$('button[type=&quot;submit&quot;]').is(&quot;:disabled&quot;)) {
                $('button[type=&quot;submit&quot;]').prop(&quot;disabled&quot;, false);
            }
            $('#eiereason').focus();
        }

        function submitEie(reason){

            const modelname = $('#modelname').val();
            let doc_id = $('#doc_id').val();

            if (modelname === 'incidentreport') {
                doc_id = $('#document_id').val();
            }

            $.ajax({
                url: '/eielog/markeie',
                type: 'POST',
                data: {
                    'inquiry_id': &quot;1672&quot;,
                    'client_id': $('#client_id').val(),
                    'modelname': modelname,
                    'docname': $('#docname').val(),
                    'eiereason': reason,
                    'doc_id': doc_id,
                    'tablename': $('#tablename').val()
                },
                success: function () {
                    let url = &quot;https://site17.lsapp.cloud/client/index/1556?section=medicalassess&quot;;
                    if ($('#redirect_url').length > 0) {
                        url = $('#redirect_url').val();
                    }

                    if (url != null &amp;&amp; url.length > 1) {
                        window.location.replace(url);
                    }
                },
                error: function (data) {
                    console.log('Error:', data);
                }
            });

        }

    

    

        
            
                
    
        
        Entered in Error
    
                
            

                
    Reason: 
    

                
                     Mark as Error
                
            
        


        
            This document has been marked as error.
            
                  Leave Document
            
        
    



    








    $(document).ready(function() {
       
           });


    </value>
      <webElementGuid>cc695ffa-04b5-4aff-8a07-c6963b1c2939</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;immunization.create&quot;)</value>
      <webElementGuid>525acd06-9c60-45c7-85e5-26d602816b5a</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='immunization.create']</value>
      <webElementGuid>0ef70876-47ed-4b6a-aef1-5c8de413a8cc</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Dismiss'])[1]/following::div[2]</value>
      <webElementGuid>9f1ffd24-1e53-43a2-9dbb-dc9751f65478</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Licensed to: Neighborhood Physicians Practice'])[1]/following::div[3]</value>
      <webElementGuid>0c09d030-33d1-4fd4-89d3-bc90d32d0226</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[3]</value>
      <webElementGuid>613f4b65-b14d-4aa1-97da-ed7641000d7f</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'immunization.create' and (text() = concat(&quot;
    
    
    
    
                
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
    
        
        
            












    
        Immunization for A Client A Automation
        DOB: 01/01/2000   MR#: 24-11006
    
    
        
         Print
    



    
        
        
            
                
                    
                        
                                
                                                                                                                                                                                             
                                                 
                        
                            
                                
                                                                                                                                                                                    Disease 
                                    Disease-- Please Select --AdenovirusAnthraxCholeraCOVID-19DiphtheriaHepatitis AHepatitis BHaemophilus influenzae type b (Hib)Human Papillomavirus (HPV)Seasonal Influenza (Flu) onlyJapanese EncephalitisMeaslesMeningococcalMumpsPertussisPneumococcalPolioRabiesRotavirusRubellaShinglesSmallpoxTetanusTuberculosisTyphoid FeverVaricellaYellow FeverAnthrax-- Please Select -- 
                                
                                
                                    
                                         
                                        
                                                                            
                                
                            
                        
                        
                            Disease
                                                        
                                                    
                                                
        
            
                                 
                                            
            
     
                
                    
                        
                                
                                                                                                                                                                                             
                                                 
                        
                            
                                
                                                                                                                                                                                    Manufacturer 
                                    Manufacturer-- Please Select --Barr Labs Inc.bioCSLDynavax TechnologiesEmergent BioSolutionsGlaxoSmithKlineJanssen (J&amp;J)Massachusetts Biological LabsMedImmuneMerckModernaPaxVaxPfizersanofiSeqirusValnevaDynavax Technologies-- Please Select -- 
                                
                                
                                    
                                         
                                        
                                                                            
                                
                            
                        
                        
                            Manufacturer
                                                        
                                                    
                                                
        
            
                                 
                                            
            
     
                
                    
                        
                                
                        Dose #1 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                            Vaccine:
                    
    
    ×adenovirus vaccine, type 4, live, oral
     Vaccine is required
    
    



    $( document ).ready(function() { 
        var vaccineInfoSpan = &quot;saved_vaccine_info&quot;;
        var oncVaccineElement = &quot;vaccine_onc_code_id&quot;;
        var vaccineElement = &quot;vaccine&quot;;

        var selectVaccineElementId = &quot;vaccine&quot;+&quot;_select&quot;;

        var select2VaccineObject = new Object;
        select2VaccineObject.placeholder = &quot; , &quot;'&quot; , &quot;Select Vaccine&quot; , &quot;'&quot; , &quot;;
        select2VaccineObject.allowClear = true;
        select2VaccineObject.templateResult = formatVaccineSelect;
        select2VaccineObject.templateSelection = formatVaccineSelection;
        select2VaccineObject.minimumInputLength = 2;
        select2VaccineObject.formatInputTooShort = function () {
                return &quot;Enter at least 2 characters&quot;;
        };
        select2VaccineObject.ajax = {
                url: &quot;/immunization/onc/getvaccine&quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                delay: 150,
                data: function (params) {
                    return {
                        q: params.term, // search term
                        page: params.page
                    };
                },
                processResults: function (data, params) {
                    // parse the results into the format expected by Select2
                    // since we are using custom formatting functions we do not need to
                    // alter the remote JSON data, except to indicate that infinite
                    // scrolling can be used
                    params.page = params.page || 1;
                    return {
                        results: data.result,
                        pagination: {
                            more: (params.page * 30) &lt; data.length
                        }
                    };
                },
                // cache: true
            };
        
        // init select 2
        var select = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).select2(select2VaccineObject);

        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).next(&quot; , &quot;'&quot; , &quot;span.select2-container&quot; , &quot;'&quot; , &quot;).css(&quot;width&quot;, &quot;100%&quot;);

        $(&quot; , &quot;'&quot; , &quot;.select2-selection__rendered&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;wraptext&quot; , &quot;'&quot; , &quot;);

        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).on(&quot; , &quot;'&quot; , &quot;select2:open&quot; , &quot;'&quot; , &quot;, function (e) {
            $(&quot; , &quot;'&quot; , &quot;.select2-dropdown&quot; , &quot;'&quot; , &quot;).removeClass(&quot; , &quot;'&quot; , &quot;select2-dropdown--above&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;select2-dropdown--below&quot; , &quot;'&quot; , &quot;);
        });

        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).on(&quot;select2:select&quot;, function (e) { 
            resetSavedVaccineInfo();
            var vaccine = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).select2(&quot; , &quot;'&quot; , &quot;data&quot; , &quot;'&quot; , &quot;)[0];
            $(&quot; , &quot;'&quot; , &quot;#vaccine&quot; , &quot;'&quot; , &quot;).val(vaccine);
            var oncVaccineElement = $(this).data(&quot; , &quot;'&quot; , &quot;vaccine_onc_code_id_element&quot; , &quot;'&quot; , &quot;);
            var vaccineElement = $(this).data(&quot; , &quot;'&quot; , &quot;vaccine_element&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+oncVaccineElement).val(vaccine.id);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+vaccineElement).val(vaccine.description ?? vaccine.text);
            var holderName = &quot;&quot;+&quot;_vaccine_select_div_holder_&quot;+&quot;&quot;;
            $(holderName + &quot; .select2-selection--single&quot;).addClass(&quot; , &quot;'&quot; , &quot;height100&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#select2-&quot; , &quot;'&quot; , &quot;+selectVaccineElementId+&quot; , &quot;'&quot; , &quot;-container&quot; , &quot;'&quot; , &quot;).parent(&quot; , &quot;'&quot; , &quot;span&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;height100&quot; , &quot;'&quot; , &quot;);
        });
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).on(&quot;select2:unselect&quot;, function (e) { 
            resetSavedVaccineInfo();
        });
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).on(&quot;select2:clear&quot;, function (e) { 
            resetSavedVaccineInfo();
        });

                
        function resetSavedVaccineInfo() {
            $(&quot; , &quot;'&quot; , &quot;#vaccine&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+oncVaccineElement).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+vaccineElement).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+vaccineInfoSpan).html(&quot;&quot;);
            var holderName = &quot;&quot;+&quot;_vaccine_select_div_holder_&quot;+&quot;&quot;;
            $(holderName + &quot; .select2-selection--single&quot;).removeClass(&quot; , &quot;'&quot; , &quot;height100&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#select2-&quot; , &quot;'&quot; , &quot;+selectVaccineElementId+&quot; , &quot;'&quot; , &quot;-container&quot; , &quot;'&quot; , &quot;).parent(&quot; , &quot;'&quot; , &quot;span&quot; , &quot;'&quot; , &quot;).removeClass(&quot; , &quot;'&quot; , &quot;height100&quot; , &quot;'&quot; , &quot;);
        }

        function formatVaccineSelect (repo) {
            if (repo.loading) {
                return repo.name;
            }

            var $container = $(
            &quot;&lt;div class=&quot; , &quot;'&quot; , &quot;select2-result-repository clearfix&quot; , &quot;'&quot; , &quot;>&quot; +
                &quot;&lt;div class=&quot; , &quot;'&quot; , &quot;select2-result-repository__name&quot; , &quot;'&quot; , &quot;>&lt;/div>&quot; +
                &quot;&lt;span id=&quot; , &quot;'&quot; , &quot;infospan&quot;+repo.id+&quot;&quot; , &quot;'&quot; , &quot; class=&quot; , &quot;'&quot; , &quot;select2-result-repository__infospan&quot; , &quot;'&quot; , &quot;>&lt;/span>&quot; +
                &quot;&lt;/div>&quot; +
                &quot;&lt;/div>&quot; +
            &quot;&lt;/div>&quot;
            );

            $container.find(&quot;.select2-result-repository__name&quot;).text(repo.description);
            $container.find(&quot;.select2-result-repository__name&quot;).val(repo.id);

            return $container;
        }

        function formatVaccineSelection (repo) {
            return repo.description;
        }

            });
                            
        
            
                                 
                                            
            
     
                
                    
                        
                                
                                        Date of Administration 
            
        
            
                                 
                                            
            
     
                
                    
                        
                                
                        Batch Expiration DateInvalid date 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                        Batch # 
            
        
            
                                 
                                            
            
     
                    
                            
                        
            
                
                    
                        
                                
                                        Vaccination-emergent adverse reactions (reported ESAVIs) 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                        Reason for not vaccinating (includes contraindications, history of ESAVI, etc.) 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                                                                            
                                 Did client have the disease?   Did client have the disease? 
            
        
            
                                 
                                            
            
     
                    
                            
                        
            
                
                    
                        
                                
                                        If yes, please explain 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                        Note 
            
        
            
                                
                            
    
 

    
        
            
                 Select File
                
            
        
    
    
        
                    
    


 






    $(document).ready(function() {

        $(&quot;#immunization_upload&quot;).on(&quot;change&quot;, function () {
            $(&quot; , &quot;'&quot; , &quot;#saved_exdoc_holder&quot; , &quot;'&quot; , &quot;).html(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            var fileval = $(this).prop(&quot;files&quot;)[0][&quot; , &quot;'&quot; , &quot;name&quot; , &quot;'&quot; , &quot;];
            $(&quot; , &quot;'&quot; , &quot;#selectedfile&quot; , &quot;'&quot; , &quot;).html(fileval);
        });

        $(&quot; , &quot;'&quot; , &quot;.updateother&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function() {
            var dependent = $(this).data(&quot; , &quot;'&quot; , &quot;dependent&quot; , &quot;'&quot; , &quot;);
            var text = $(this).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text();
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+dependent).val(text);
        });

        $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;.switchfield&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function() {
            var val = $(this).val();
            var updatefield = $(this).data(&quot; , &quot;'&quot; , &quot;update&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+updatefield).val(val);
        });

        $(&quot; , &quot;'&quot; , &quot;.switchselect&quot; , &quot;'&quot; , &quot;).each(function() {
            var id = $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;);
            updateSwitchElements(id, false);
        });

        $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;.switchselect&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function() {
            var id = $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;);
            updateSwitchElements(id);
        });

        $(&quot; , &quot;'&quot; , &quot;.hideshow&quot; , &quot;'&quot; , &quot;).each(function() {
            var id = $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;);
            updateHiddenField(id);
        });

        $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;.hideshow&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function() {
            var id = $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;);
            updateHiddenField(id);
        });

                var thisId = &quot;disease&quot;;
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+thisId+&quot; , &quot;'&quot; , &quot;_select&quot; , &quot;'&quot; , &quot;).select2({
            placeholder: &quot; , &quot;'&quot; , &quot;-Select-&quot; , &quot;'&quot; , &quot;,
            allowClear: false,
            closeOnSelect: true,
            maximumSelected:1,
            theme: &quot; , &quot;'&quot; , &quot;bootstrap&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;resolve&quot; , &quot;'&quot; , &quot;
        }); 
                var thisId = &quot;cvxcode&quot;;
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+thisId+&quot; , &quot;'&quot; , &quot;_select&quot; , &quot;'&quot; , &quot;).select2({
            placeholder: &quot; , &quot;'&quot; , &quot;-Select-&quot; , &quot;'&quot; , &quot;,
            allowClear: false,
            closeOnSelect: true,
            maximumSelected:1,
            theme: &quot; , &quot;'&quot; , &quot;bootstrap&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;resolve&quot; , &quot;'&quot; , &quot;
        }); 
                var thisId = &quot;manufacturer&quot;;
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+thisId+&quot; , &quot;'&quot; , &quot;_select&quot; , &quot;'&quot; , &quot;).select2({
            placeholder: &quot; , &quot;'&quot; , &quot;-Select-&quot; , &quot;'&quot; , &quot;,
            allowClear: false,
            closeOnSelect: true,
            maximumSelected:1,
            theme: &quot; , &quot;'&quot; , &quot;bootstrap&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;resolve&quot; , &quot;'&quot; , &quot;
        }); 
        
        function updateSwitchElements(id, isChange = true) {
            var select = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).data(&quot; , &quot;'&quot; , &quot;select&quot; , &quot;'&quot; , &quot;);
            var selectElement = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+select);
            var text = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).data(&quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;);
            var textElement = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+text);
            var i = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).find(&quot; , &quot;'&quot; , &quot;i.fa&quot; , &quot;'&quot; , &quot;);
            if(i.hasClass(&quot; , &quot;'&quot; , &quot;fa-pencil&quot; , &quot;'&quot; , &quot;)) {
                if(textElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    textElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).show();
                } else {
                    textElement.show();
                }
                if(selectElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    selectElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).hide();
                } else {
                    selectElement.hide();
                }
                i.removeClass(&quot; , &quot;'&quot; , &quot;fa-pencil&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;fa-list&quot; , &quot;'&quot; , &quot;);
                if(select == &quot; , &quot;'&quot; , &quot;cvxcode_select&quot; , &quot;'&quot; , &quot; &amp;&amp; isChange) {
                    $(&quot; , &quot;'&quot; , &quot;#vaccine&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;#cvxcode_text&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                }
            } else {
                if(selectElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    selectElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).show();
                } else {
                    selectElement.show();
                }
                if(textElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    textElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).hide();
                } else {
                    textElement.hide();
                }
                i.removeClass(&quot; , &quot;'&quot; , &quot;fa-list&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;fa-pencil&quot; , &quot;'&quot; , &quot;);
                if(select == &quot; , &quot;'&quot; , &quot;cvxcode_select&quot; , &quot;'&quot; , &quot; &amp;&amp; isChange) {
                    var text = selectElement.find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text();
                    $(&quot; , &quot;'&quot; , &quot;#vaccine&quot; , &quot;'&quot; , &quot;).val(text);
                }
            }
        }

        function updateHiddenField(id) {
            var show = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).data(&quot; , &quot;'&quot; , &quot;show&quot; , &quot;'&quot; , &quot;);
            var element = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+show);
            if($(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;)) {
                if(element.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    element.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).show();
                } else {
                    element.show();
                }
            } else {
                if(element.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    element.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).hide();
                } else {
                    element.hide();
                }
            }
        }
    });


        

        
            
                
                    
                        
                        
                        Disease
                                    
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                        Manufacturer
                                    
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                            Dose #
                                    1
                            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
                        Vaccine
                                                        
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                                                    Date of Administration
                                    
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                                        Batch Expiration Date
                                    
                            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
                                                    Batch #
                                    
                            
        

                                 
                                            
            
        
        
                            
            
            
                
                    
                        
                        
         
                Vaccination-emergent adverse reactions (reported ESAVIs)
                
            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
         
                Reason for not vaccinating (includes contraindications, history of ESAVI, etc.)
                
            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
                            
                 
                     Did client have the disease?
                            
        

                                 
                                            
            
        
        
                            
            
            
                
                    
                        
                        
         
                If yes, please explain
                
            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
         
                Note
                
            
        

                                    
                            
    

        
        
        
            
                
                                
                
                
                
 


    $(document).ready(function () {
        $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;#btnmainfrmsubmit, #btnmainfrmcancel, #btnmarkeie, .unfinalsave&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function() {
            try {
                parent.closeIFrame();
            } catch {
                // No Catch. Assigns the med to a medq if it was triggered from the MAR
                // Otherwise, function does not exist
            }
        });

    });





    
        
            
            
    
        
        Sign and Lock
    
            
    






    
        
            You are set to have a QCC required, but you have no designated QCC set in User Administration.  An administrator can adjust your QCC setting in your User Administration profile.
        
    




 


 

    
         Save
        
    
    
                    
                 Cancel
            

                                    

            Creator / Last Editor Name - Automation Test
            
        
    
                    
            $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;.btnSubmitToNext&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
                $(&quot;#hdnNextDssCheck&quot;).val($(this).data(&quot; , &quot;'&quot; , &quot;doc_id&quot; , &quot;'&quot; , &quot;)).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, false).closest(&quot;form&quot;).submit();
            });
        
        
        
            You have other unsigned forms
            
            
                                                    
                        For Another Client:
                          Save And Open Next
                            Unsigned
                        
                    
                    
                        
                         Next
                    
                            
        
        
            
                            
        
    

    
            
        
        
        function showEieSection() {
            if (!$(&quot; , &quot;'&quot; , &quot;button[type=&quot;submit&quot;]&quot; , &quot;'&quot; , &quot;).is(&quot;:disabled&quot;)) {
                $(&quot; , &quot;'&quot; , &quot;button[type=&quot;submit&quot;]&quot; , &quot;'&quot; , &quot;).prop(&quot;disabled&quot;, false);
            }
            $(&quot; , &quot;'&quot; , &quot;#eiereason&quot; , &quot;'&quot; , &quot;).focus();
        }

        function submitEie(reason){

            const modelname = $(&quot; , &quot;'&quot; , &quot;#modelname&quot; , &quot;'&quot; , &quot;).val();
            let doc_id = $(&quot; , &quot;'&quot; , &quot;#doc_id&quot; , &quot;'&quot; , &quot;).val();

            if (modelname === &quot; , &quot;'&quot; , &quot;incidentreport&quot; , &quot;'&quot; , &quot;) {
                doc_id = $(&quot; , &quot;'&quot; , &quot;#document_id&quot; , &quot;'&quot; , &quot;).val();
            }

            $.ajax({
                url: &quot; , &quot;'&quot; , &quot;/eielog/markeie&quot; , &quot;'&quot; , &quot;,
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                data: {
                    &quot; , &quot;'&quot; , &quot;inquiry_id&quot; , &quot;'&quot; , &quot;: &quot;1672&quot;,
                    &quot; , &quot;'&quot; , &quot;client_id&quot; , &quot;'&quot; , &quot;: $(&quot; , &quot;'&quot; , &quot;#client_id&quot; , &quot;'&quot; , &quot;).val(),
                    &quot; , &quot;'&quot; , &quot;modelname&quot; , &quot;'&quot; , &quot;: modelname,
                    &quot; , &quot;'&quot; , &quot;docname&quot; , &quot;'&quot; , &quot;: $(&quot; , &quot;'&quot; , &quot;#docname&quot; , &quot;'&quot; , &quot;).val(),
                    &quot; , &quot;'&quot; , &quot;eiereason&quot; , &quot;'&quot; , &quot;: reason,
                    &quot; , &quot;'&quot; , &quot;doc_id&quot; , &quot;'&quot; , &quot;: doc_id,
                    &quot; , &quot;'&quot; , &quot;tablename&quot; , &quot;'&quot; , &quot;: $(&quot; , &quot;'&quot; , &quot;#tablename&quot; , &quot;'&quot; , &quot;).val()
                },
                success: function () {
                    let url = &quot;https://site17.lsapp.cloud/client/index/1556?section=medicalassess&quot;;
                    if ($(&quot; , &quot;'&quot; , &quot;#redirect_url&quot; , &quot;'&quot; , &quot;).length > 0) {
                        url = $(&quot; , &quot;'&quot; , &quot;#redirect_url&quot; , &quot;'&quot; , &quot;).val();
                    }

                    if (url != null &amp;&amp; url.length > 1) {
                        window.location.replace(url);
                    }
                },
                error: function (data) {
                    console.log(&quot; , &quot;'&quot; , &quot;Error:&quot; , &quot;'&quot; , &quot;, data);
                }
            });

        }

    

    

        
            
                
    
        
        Entered in Error
    
                
            

                
    Reason: 
    

                
                     Mark as Error
                
            
        


        
            This document has been marked as error.
            
                  Leave Document
            
        
    



    








    $(document).ready(function() {
       
           });


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
    
        
        
            












    
        Immunization for A Client A Automation
        DOB: 01/01/2000   MR#: 24-11006
    
    
        
         Print
    



    
        
        
            
                
                    
                        
                                
                                                                                                                                                                                             
                                                 
                        
                            
                                
                                                                                                                                                                                    Disease 
                                    Disease-- Please Select --AdenovirusAnthraxCholeraCOVID-19DiphtheriaHepatitis AHepatitis BHaemophilus influenzae type b (Hib)Human Papillomavirus (HPV)Seasonal Influenza (Flu) onlyJapanese EncephalitisMeaslesMeningococcalMumpsPertussisPneumococcalPolioRabiesRotavirusRubellaShinglesSmallpoxTetanusTuberculosisTyphoid FeverVaricellaYellow FeverAnthrax-- Please Select -- 
                                
                                
                                    
                                         
                                        
                                                                            
                                
                            
                        
                        
                            Disease
                                                        
                                                    
                                                
        
            
                                 
                                            
            
     
                
                    
                        
                                
                                                                                                                                                                                             
                                                 
                        
                            
                                
                                                                                                                                                                                    Manufacturer 
                                    Manufacturer-- Please Select --Barr Labs Inc.bioCSLDynavax TechnologiesEmergent BioSolutionsGlaxoSmithKlineJanssen (J&amp;J)Massachusetts Biological LabsMedImmuneMerckModernaPaxVaxPfizersanofiSeqirusValnevaDynavax Technologies-- Please Select -- 
                                
                                
                                    
                                         
                                        
                                                                            
                                
                            
                        
                        
                            Manufacturer
                                                        
                                                    
                                                
        
            
                                 
                                            
            
     
                
                    
                        
                                
                        Dose #1 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                            Vaccine:
                    
    
    ×adenovirus vaccine, type 4, live, oral
     Vaccine is required
    
    



    $( document ).ready(function() { 
        var vaccineInfoSpan = &quot;saved_vaccine_info&quot;;
        var oncVaccineElement = &quot;vaccine_onc_code_id&quot;;
        var vaccineElement = &quot;vaccine&quot;;

        var selectVaccineElementId = &quot;vaccine&quot;+&quot;_select&quot;;

        var select2VaccineObject = new Object;
        select2VaccineObject.placeholder = &quot; , &quot;'&quot; , &quot;Select Vaccine&quot; , &quot;'&quot; , &quot;;
        select2VaccineObject.allowClear = true;
        select2VaccineObject.templateResult = formatVaccineSelect;
        select2VaccineObject.templateSelection = formatVaccineSelection;
        select2VaccineObject.minimumInputLength = 2;
        select2VaccineObject.formatInputTooShort = function () {
                return &quot;Enter at least 2 characters&quot;;
        };
        select2VaccineObject.ajax = {
                url: &quot;/immunization/onc/getvaccine&quot;,
                dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
                delay: 150,
                data: function (params) {
                    return {
                        q: params.term, // search term
                        page: params.page
                    };
                },
                processResults: function (data, params) {
                    // parse the results into the format expected by Select2
                    // since we are using custom formatting functions we do not need to
                    // alter the remote JSON data, except to indicate that infinite
                    // scrolling can be used
                    params.page = params.page || 1;
                    return {
                        results: data.result,
                        pagination: {
                            more: (params.page * 30) &lt; data.length
                        }
                    };
                },
                // cache: true
            };
        
        // init select 2
        var select = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).select2(select2VaccineObject);

        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).next(&quot; , &quot;'&quot; , &quot;span.select2-container&quot; , &quot;'&quot; , &quot;).css(&quot;width&quot;, &quot;100%&quot;);

        $(&quot; , &quot;'&quot; , &quot;.select2-selection__rendered&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;wraptext&quot; , &quot;'&quot; , &quot;);

        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).on(&quot; , &quot;'&quot; , &quot;select2:open&quot; , &quot;'&quot; , &quot;, function (e) {
            $(&quot; , &quot;'&quot; , &quot;.select2-dropdown&quot; , &quot;'&quot; , &quot;).removeClass(&quot; , &quot;'&quot; , &quot;select2-dropdown--above&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;select2-dropdown--below&quot; , &quot;'&quot; , &quot;);
        });

        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).on(&quot;select2:select&quot;, function (e) { 
            resetSavedVaccineInfo();
            var vaccine = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).select2(&quot; , &quot;'&quot; , &quot;data&quot; , &quot;'&quot; , &quot;)[0];
            $(&quot; , &quot;'&quot; , &quot;#vaccine&quot; , &quot;'&quot; , &quot;).val(vaccine);
            var oncVaccineElement = $(this).data(&quot; , &quot;'&quot; , &quot;vaccine_onc_code_id_element&quot; , &quot;'&quot; , &quot;);
            var vaccineElement = $(this).data(&quot; , &quot;'&quot; , &quot;vaccine_element&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+oncVaccineElement).val(vaccine.id);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+vaccineElement).val(vaccine.description ?? vaccine.text);
            var holderName = &quot;&quot;+&quot;_vaccine_select_div_holder_&quot;+&quot;&quot;;
            $(holderName + &quot; .select2-selection--single&quot;).addClass(&quot; , &quot;'&quot; , &quot;height100&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#select2-&quot; , &quot;'&quot; , &quot;+selectVaccineElementId+&quot; , &quot;'&quot; , &quot;-container&quot; , &quot;'&quot; , &quot;).parent(&quot; , &quot;'&quot; , &quot;span&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;height100&quot; , &quot;'&quot; , &quot;);
        });
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).on(&quot;select2:unselect&quot;, function (e) { 
            resetSavedVaccineInfo();
        });
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+selectVaccineElementId).on(&quot;select2:clear&quot;, function (e) { 
            resetSavedVaccineInfo();
        });

                
        function resetSavedVaccineInfo() {
            $(&quot; , &quot;'&quot; , &quot;#vaccine&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+oncVaccineElement).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+vaccineElement).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+vaccineInfoSpan).html(&quot;&quot;);
            var holderName = &quot;&quot;+&quot;_vaccine_select_div_holder_&quot;+&quot;&quot;;
            $(holderName + &quot; .select2-selection--single&quot;).removeClass(&quot; , &quot;'&quot; , &quot;height100&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#select2-&quot; , &quot;'&quot; , &quot;+selectVaccineElementId+&quot; , &quot;'&quot; , &quot;-container&quot; , &quot;'&quot; , &quot;).parent(&quot; , &quot;'&quot; , &quot;span&quot; , &quot;'&quot; , &quot;).removeClass(&quot; , &quot;'&quot; , &quot;height100&quot; , &quot;'&quot; , &quot;);
        }

        function formatVaccineSelect (repo) {
            if (repo.loading) {
                return repo.name;
            }

            var $container = $(
            &quot;&lt;div class=&quot; , &quot;'&quot; , &quot;select2-result-repository clearfix&quot; , &quot;'&quot; , &quot;>&quot; +
                &quot;&lt;div class=&quot; , &quot;'&quot; , &quot;select2-result-repository__name&quot; , &quot;'&quot; , &quot;>&lt;/div>&quot; +
                &quot;&lt;span id=&quot; , &quot;'&quot; , &quot;infospan&quot;+repo.id+&quot;&quot; , &quot;'&quot; , &quot; class=&quot; , &quot;'&quot; , &quot;select2-result-repository__infospan&quot; , &quot;'&quot; , &quot;>&lt;/span>&quot; +
                &quot;&lt;/div>&quot; +
                &quot;&lt;/div>&quot; +
            &quot;&lt;/div>&quot;
            );

            $container.find(&quot;.select2-result-repository__name&quot;).text(repo.description);
            $container.find(&quot;.select2-result-repository__name&quot;).val(repo.id);

            return $container;
        }

        function formatVaccineSelection (repo) {
            return repo.description;
        }

            });
                            
        
            
                                 
                                            
            
     
                
                    
                        
                                
                                        Date of Administration 
            
        
            
                                 
                                            
            
     
                
                    
                        
                                
                        Batch Expiration DateInvalid date 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                        Batch # 
            
        
            
                                 
                                            
            
     
                    
                            
                        
            
                
                    
                        
                                
                                        Vaccination-emergent adverse reactions (reported ESAVIs) 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                        Reason for not vaccinating (includes contraindications, history of ESAVI, etc.) 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                                                                            
                                 Did client have the disease?   Did client have the disease? 
            
        
            
                                 
                                            
            
     
                    
                            
                        
            
                
                    
                        
                                
                                        If yes, please explain 
            
        
            
                                
                            
            
     
                    
                        
            
                
                    
                        
                                
                                        Note 
            
        
            
                                
                            
    
 

    
        
            
                 Select File
                
            
        
    
    
        
                    
    


 






    $(document).ready(function() {

        $(&quot;#immunization_upload&quot;).on(&quot;change&quot;, function () {
            $(&quot; , &quot;'&quot; , &quot;#saved_exdoc_holder&quot; , &quot;'&quot; , &quot;).html(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            var fileval = $(this).prop(&quot;files&quot;)[0][&quot; , &quot;'&quot; , &quot;name&quot; , &quot;'&quot; , &quot;];
            $(&quot; , &quot;'&quot; , &quot;#selectedfile&quot; , &quot;'&quot; , &quot;).html(fileval);
        });

        $(&quot; , &quot;'&quot; , &quot;.updateother&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function() {
            var dependent = $(this).data(&quot; , &quot;'&quot; , &quot;dependent&quot; , &quot;'&quot; , &quot;);
            var text = $(this).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text();
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+dependent).val(text);
        });

        $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;.switchfield&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function() {
            var val = $(this).val();
            var updatefield = $(this).data(&quot; , &quot;'&quot; , &quot;update&quot; , &quot;'&quot; , &quot;);
            $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+updatefield).val(val);
        });

        $(&quot; , &quot;'&quot; , &quot;.switchselect&quot; , &quot;'&quot; , &quot;).each(function() {
            var id = $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;);
            updateSwitchElements(id, false);
        });

        $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;.switchselect&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function() {
            var id = $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;);
            updateSwitchElements(id);
        });

        $(&quot; , &quot;'&quot; , &quot;.hideshow&quot; , &quot;'&quot; , &quot;).each(function() {
            var id = $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;);
            updateHiddenField(id);
        });

        $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;.hideshow&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function() {
            var id = $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;);
            updateHiddenField(id);
        });

                var thisId = &quot;disease&quot;;
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+thisId+&quot; , &quot;'&quot; , &quot;_select&quot; , &quot;'&quot; , &quot;).select2({
            placeholder: &quot; , &quot;'&quot; , &quot;-Select-&quot; , &quot;'&quot; , &quot;,
            allowClear: false,
            closeOnSelect: true,
            maximumSelected:1,
            theme: &quot; , &quot;'&quot; , &quot;bootstrap&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;resolve&quot; , &quot;'&quot; , &quot;
        }); 
                var thisId = &quot;cvxcode&quot;;
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+thisId+&quot; , &quot;'&quot; , &quot;_select&quot; , &quot;'&quot; , &quot;).select2({
            placeholder: &quot; , &quot;'&quot; , &quot;-Select-&quot; , &quot;'&quot; , &quot;,
            allowClear: false,
            closeOnSelect: true,
            maximumSelected:1,
            theme: &quot; , &quot;'&quot; , &quot;bootstrap&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;resolve&quot; , &quot;'&quot; , &quot;
        }); 
                var thisId = &quot;manufacturer&quot;;
        $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+thisId+&quot; , &quot;'&quot; , &quot;_select&quot; , &quot;'&quot; , &quot;).select2({
            placeholder: &quot; , &quot;'&quot; , &quot;-Select-&quot; , &quot;'&quot; , &quot;,
            allowClear: false,
            closeOnSelect: true,
            maximumSelected:1,
            theme: &quot; , &quot;'&quot; , &quot;bootstrap&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;resolve&quot; , &quot;'&quot; , &quot;
        }); 
        
        function updateSwitchElements(id, isChange = true) {
            var select = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).data(&quot; , &quot;'&quot; , &quot;select&quot; , &quot;'&quot; , &quot;);
            var selectElement = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+select);
            var text = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).data(&quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;);
            var textElement = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+text);
            var i = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).find(&quot; , &quot;'&quot; , &quot;i.fa&quot; , &quot;'&quot; , &quot;);
            if(i.hasClass(&quot; , &quot;'&quot; , &quot;fa-pencil&quot; , &quot;'&quot; , &quot;)) {
                if(textElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    textElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).show();
                } else {
                    textElement.show();
                }
                if(selectElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    selectElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).hide();
                } else {
                    selectElement.hide();
                }
                i.removeClass(&quot; , &quot;'&quot; , &quot;fa-pencil&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;fa-list&quot; , &quot;'&quot; , &quot;);
                if(select == &quot; , &quot;'&quot; , &quot;cvxcode_select&quot; , &quot;'&quot; , &quot; &amp;&amp; isChange) {
                    $(&quot; , &quot;'&quot; , &quot;#vaccine&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                    $(&quot; , &quot;'&quot; , &quot;#cvxcode_text&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
                }
            } else {
                if(selectElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    selectElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).show();
                } else {
                    selectElement.show();
                }
                if(textElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    textElement.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).hide();
                } else {
                    textElement.hide();
                }
                i.removeClass(&quot; , &quot;'&quot; , &quot;fa-list&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;fa-pencil&quot; , &quot;'&quot; , &quot;);
                if(select == &quot; , &quot;'&quot; , &quot;cvxcode_select&quot; , &quot;'&quot; , &quot; &amp;&amp; isChange) {
                    var text = selectElement.find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text();
                    $(&quot; , &quot;'&quot; , &quot;#vaccine&quot; , &quot;'&quot; , &quot;).val(text);
                }
            }
        }

        function updateHiddenField(id) {
            var show = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).data(&quot; , &quot;'&quot; , &quot;show&quot; , &quot;'&quot; , &quot;);
            var element = $(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+show);
            if($(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;+id).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;)) {
                if(element.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    element.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).show();
                } else {
                    element.show();
                }
            } else {
                if(element.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;)) {
                    element.parent(&quot; , &quot;'&quot; , &quot;div.form-group&quot; , &quot;'&quot; , &quot;).hide();
                } else {
                    element.hide();
                }
            }
        }
    });


        

        
            
                
                    
                        
                        
                        Disease
                                    
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                        Manufacturer
                                    
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                            Dose #
                                    1
                            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
                        Vaccine
                                                        
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                                                    Date of Administration
                                    
                            
        

                                 
                                            
            
        
                
                    
                        
                        
                                        Batch Expiration Date
                                    
                            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
                                                    Batch #
                                    
                            
        

                                 
                                            
            
        
        
                            
            
            
                
                    
                        
                        
         
                Vaccination-emergent adverse reactions (reported ESAVIs)
                
            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
         
                Reason for not vaccinating (includes contraindications, history of ESAVI, etc.)
                
            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
                            
                 
                     Did client have the disease?
                            
        

                                 
                                            
            
        
        
                            
            
            
                
                    
                        
                        
         
                If yes, please explain
                
            
        

                                    
                            
            
        
        
            
            
                
                    
                        
                        
         
                Note
                
            
        

                                    
                            
    

        
        
        
            
                
                                
                
                
                
 


    $(document).ready(function () {
        $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;#btnmainfrmsubmit, #btnmainfrmcancel, #btnmarkeie, .unfinalsave&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function() {
            try {
                parent.closeIFrame();
            } catch {
                // No Catch. Assigns the med to a medq if it was triggered from the MAR
                // Otherwise, function does not exist
            }
        });

    });





    
        
            
            
    
        
        Sign and Lock
    
            
    






    
        
            You are set to have a QCC required, but you have no designated QCC set in User Administration.  An administrator can adjust your QCC setting in your User Administration profile.
        
    




 


 

    
         Save
        
    
    
                    
                 Cancel
            

                                    

            Creator / Last Editor Name - Automation Test
            
        
    
                    
            $(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).delegate(&quot; , &quot;'&quot; , &quot;.btnSubmitToNext&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
                $(&quot;#hdnNextDssCheck&quot;).val($(this).data(&quot; , &quot;'&quot; , &quot;doc_id&quot; , &quot;'&quot; , &quot;)).prop(&quot; , &quot;'&quot; , &quot;disabled&quot; , &quot;'&quot; , &quot;, false).closest(&quot;form&quot;).submit();
            });
        
        
        
            You have other unsigned forms
            
            
                                                    
                        For Another Client:
                          Save And Open Next
                            Unsigned
                        
                    
                    
                        
                         Next
                    
                            
        
        
            
                            
        
    

    
            
        
        
        function showEieSection() {
            if (!$(&quot; , &quot;'&quot; , &quot;button[type=&quot;submit&quot;]&quot; , &quot;'&quot; , &quot;).is(&quot;:disabled&quot;)) {
                $(&quot; , &quot;'&quot; , &quot;button[type=&quot;submit&quot;]&quot; , &quot;'&quot; , &quot;).prop(&quot;disabled&quot;, false);
            }
            $(&quot; , &quot;'&quot; , &quot;#eiereason&quot; , &quot;'&quot; , &quot;).focus();
        }

        function submitEie(reason){

            const modelname = $(&quot; , &quot;'&quot; , &quot;#modelname&quot; , &quot;'&quot; , &quot;).val();
            let doc_id = $(&quot; , &quot;'&quot; , &quot;#doc_id&quot; , &quot;'&quot; , &quot;).val();

            if (modelname === &quot; , &quot;'&quot; , &quot;incidentreport&quot; , &quot;'&quot; , &quot;) {
                doc_id = $(&quot; , &quot;'&quot; , &quot;#document_id&quot; , &quot;'&quot; , &quot;).val();
            }

            $.ajax({
                url: &quot; , &quot;'&quot; , &quot;/eielog/markeie&quot; , &quot;'&quot; , &quot;,
                type: &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;,
                data: {
                    &quot; , &quot;'&quot; , &quot;inquiry_id&quot; , &quot;'&quot; , &quot;: &quot;1672&quot;,
                    &quot; , &quot;'&quot; , &quot;client_id&quot; , &quot;'&quot; , &quot;: $(&quot; , &quot;'&quot; , &quot;#client_id&quot; , &quot;'&quot; , &quot;).val(),
                    &quot; , &quot;'&quot; , &quot;modelname&quot; , &quot;'&quot; , &quot;: modelname,
                    &quot; , &quot;'&quot; , &quot;docname&quot; , &quot;'&quot; , &quot;: $(&quot; , &quot;'&quot; , &quot;#docname&quot; , &quot;'&quot; , &quot;).val(),
                    &quot; , &quot;'&quot; , &quot;eiereason&quot; , &quot;'&quot; , &quot;: reason,
                    &quot; , &quot;'&quot; , &quot;doc_id&quot; , &quot;'&quot; , &quot;: doc_id,
                    &quot; , &quot;'&quot; , &quot;tablename&quot; , &quot;'&quot; , &quot;: $(&quot; , &quot;'&quot; , &quot;#tablename&quot; , &quot;'&quot; , &quot;).val()
                },
                success: function () {
                    let url = &quot;https://site17.lsapp.cloud/client/index/1556?section=medicalassess&quot;;
                    if ($(&quot; , &quot;'&quot; , &quot;#redirect_url&quot; , &quot;'&quot; , &quot;).length > 0) {
                        url = $(&quot; , &quot;'&quot; , &quot;#redirect_url&quot; , &quot;'&quot; , &quot;).val();
                    }

                    if (url != null &amp;&amp; url.length > 1) {
                        window.location.replace(url);
                    }
                },
                error: function (data) {
                    console.log(&quot; , &quot;'&quot; , &quot;Error:&quot; , &quot;'&quot; , &quot;, data);
                }
            });

        }

    

    

        
            
                
    
        
        Entered in Error
    
                
            

                
    Reason: 
    

                
                     Mark as Error
                
            
        


        
            This document has been marked as error.
            
                  Leave Document
            
        
    



    








    $(document).ready(function() {
       
           });


    &quot;))]</value>
      <webElementGuid>6116e805-e670-4182-960a-5f0b77141b68</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
