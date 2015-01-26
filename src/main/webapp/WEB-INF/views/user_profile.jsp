<%@include file="page_header.jsp"%>

<section id='content'>
    <div class='container-fluid'>
        <div class='row-fluid' id='content-wrapper'>
            <div class='span12'>
                <div class='page-header'>
                    <h1 class='pull-left'>
                        <i class='icon-user'></i>
                        <span>User profile</span>
                    </h1>
                    <div class='pull-right'>
                        <ul class='breadcrumb'>
                            <li>
                                <a href="index.html"><i class='icon-bar-chart'></i>
                                </a>
                            </li>
                            <li class='separator'>
                                <i class='icon-angle-right'></i>
                            </li>
                            <li>Example pages</li>
                            <li class='separator'>
                                <i class='icon-angle-right'></i>
                            </li>
                            <li class='active'>User profile</li>
                        </ul>
                    </div>
                </div>
                <div class='row-fluid'>
                    <div class='span3 box'>
                        <div class='box-content'>
                            <img alt="230x230&amp;text=photo" src="http://placehold.it/230x230&amp;text=Photo" />
                        </div>
                    </div>
                    <div class='span9 box'>
                        <div class='box-content box-double-padding'>
                            <form class='form' style='margin-bottom: 0;'>
                                <fieldset>
                                    <div class='span4'>
                                        <div class='lead'>
                                            <i class='icon-signin text-contrast'></i>
                                            Login info
                                        </div>
                                        <small class='muted'>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nisl est, vulputate at porttitor non, interdum a mauris. Phasellus imperdiet gravida pulvinar.</small>
                                    </div>
                                    <div class='span7 offset1'>
                                        <div class='control-group'>
                                            <label class='control-label'>Username</label>
                                            <div class='controls'>
                                                <input class='span12' id='username' placeholder='Username' type='text' />
                                            </div>
                                        </div>
                                        <hr class='hr-normal' />
                                        <div class='control-group'>
                                            <div class='controls'>
                                                <label class='checkbox'>
                                                    <input data-target='#change-password' data-toggle='collapse' id='changepasswordcheck' type='checkbox' value='option1' />
                                                    Change password?
                                                </label>
                                            </div>
                                        </div>
                                        <div class='collapse' id='change-password'>
                                            <div class='control-group'>
                                                <label class='control-label'>Password</label>
                                                <div class='controls'>
                                                    <input class='span12' id='password' placeholder='Password' type='password' />
                                                </div>
                                            </div>
                                            <div class='control-group'>
                                                <label class='control-label'>Password confirmation</label>
                                                <div class='controls'>
                                                    <input class='span12' id='password-confirmation' placeholder='Password confirmation' type='password' />
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                                <hr class='hr-normal' />
                                <fieldset>
                                    <div class='span4 box'>
                                        <div class='lead'>
                                            <i class='icon-user text-contrast'></i>
                                            Personal info
                                        </div>
                                        <small class='muted'>Proin eu nibh ut urna tristique rhoncus. Sed euismod, quam sed dignissim imperdiet, nulla leo vehicula mi, a sagittis lacus augue nec sapien.</small>
                                    </div>
                                    <div class='span7 offset1'>
                                        <div class='control-group'>
                                            <label class='control-label'>Nick name</label>
                                            <div class='controls'>
                                                <input class='span12' id='firstname' placeholder='First name' type='text' />
                                            </div>
                                        </div>
                                        <div class='control-group'>
                                            <label class='control-label'>Real name</label>
                                            <div class='controls'>
                                                <input class='span12' id='lastname' placeholder='Last name' type='text' />
                                            </div>
                                        </div>
                                         <div class='control-group'>
                                            <label class='control-label'>Sex</label>
                                            <div class='controls'>
                                                <label class='radio inline'>
                           							 <input type='radio' value='1' />Male
                        						</label>
                        						<label class='radio inline'>
                            						<input type='radio' value='0' />Famale
                        						</label>
                                            </div>
                                        </div>
                                        <hr />
                                        <div class='control-group'>
                           					 <label class='control-label'>Company</label>
                            				<div class='controls'>
                                				<div class='input-append'>
                                    				<input class='span12' id='appendedInputButtons1' type='text' />
                                    				<button class='btn' type='button'>
                                        				<i class='icon-building'></i>
                                    				</button>
                               					 </div>
                           					 </div>
                       					 </div>
                       					 <div class='control-group'>
						                    <label class='control-label' for='inputSelect'>Dept</label>
						                    <div class='controls'>
						                        <select id='inputSelect'>
						                            <option />1
						                            <option />2
						                            <option />3
						                            <option />4
						                            <option />5
						                        </select>
						                    </div>
						                </div>
						                <hr />
                                        <div class='control-group'>
                                            <label class='control-label'>E-mail</label>
                                            <div class='controls'>
                                                <input class='span12' id='email' placeholder='E-mail' type='text' />
                                            </div>
                                        </div>
                                        <div class='control-group'>
                                            <label class='control-label'>Telephone</label>
                                            <div class='controls'>
                                                <input class='span12' id='telephone' placeholder='Telephone' type='text' />
                                            </div>
                                        </div>
                                        <div class='control-group'>
                                            <label class='control-label'>Mobile</label>
                                            <div class='controls'>
                                                <input class='span12' id='mobile' placeholder='Mobile' type='text' />
                                            </div>
                                        </div>
                                        <div class='control-group'>
                                            <label class='control-label'>Address</label>
                                            <div class='controls'>
                                                <input class='span12' id='address' placeholder='Address' type='text' />
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                                <div class='form-actions' style='margin-bottom: 0;'>
                                    <div class='text-right'>
                                        <div class='btn btn-primary btn-large'>
                                            <i class='icon-save'></i>
                                            Save
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<%@include file="page_footer.jsp"%>
