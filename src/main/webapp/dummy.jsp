<div class="wrapper-editor">
  <div class="block my-4">
    <div class="d-flex justify-content-center">
      <p class="h5 text-primary createShowP">0 row selected</p>
    </div>
  </div>

  <div class="row d-flex justify-content-center modalWrapper">
    <div class="modal fade addNewInputs" id="modalAdd" tabindex="-1" role="dialog" aria-labelledby="modalAdd"
      aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header text-center">
            <h4 class="modal-title w-100 font-weight-bold text-primary ml-5">Add new form</h4>
            <button type="button" class="close text-primary" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body mx-3">
            <div class="md-form mb-5">
              <input type="text" id="inputName" class="form-control validate">
              <label data-error="wrong" data-success="right" for="inputName">Name</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="inputPosition" class="form-control validate">
              <label data-error="wrong" data-success="right" for="inputPosition">Position</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="inputOfficeInput" class="form-control validate">
              <label data-error="wrong" data-success="right" for="inputOfficeInput">Office</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="inputAge" class="form-control validate">
              <label data-error="wrong" data-success="right" for="inputAge">Age</label>
            </div>
            <div class="md-form mb-5">
              <input type="date" id="inputDate" class="form-control" placeholder="Select Date">
              <label data-error="wrong" data-success="right" for="inputDate"></label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="inputSalary" class="form-control validate">
              <label data-error="wrong" data-success="right" for="inputSalary">Salary</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="inputSalary12" class="form-control validate">
              <label data-error="wrong" data-success="right" for="inputSalary12">Examples</label>
            </div>
          </div>
          <div class="modal-footer d-flex justify-content-center buttonAddFormWrapper">
            <button class="btn btn-outline-primary btn-block buttonAdd" data-dismiss="modal">Add form
              <i class="far fa-paper-plane ml-1"></i>
            </button>
          </div>
        </div>
      </div>
    </div>
    <div class="text-center wrapperToBtnModalAdd">
      <a href="" class="btn btn-info btn-rounded btn-sm btnToModalAdd" data-toggle="modal" data-target="#modalAdd"><i
          class="fas fa-plus-square"></i></a>
    </div>
    <div class="modal fade modalEditClass" id="modalEdit" tabindex="-1" role="dialog" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header text-center">
            <h4 class="modal-title w-100 font-weight-bold text-secondary ml-5">Edit form</h4>
            <button type="button" class="close text-secondary" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body mx-3 modal-inputs">
            <div class="md-form mb-5">
              <input type="text" id="formNameEdit" class="form-control validate">
              <label data-error="wrong" data-success="right" for="formNameEdit">Name</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="formPositionEdit" class="form-control validate">
              <label data-error="wrong" data-success="right" for="formPositionEdit">Position</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="formOfficeEdit" class="form-control validate">
              <label data-error="wrong" data-success="right" for="formOfficeEdit">Office</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="formAgeEdit" class="form-control validate">
              <label data-error="wrong" data-success="right" for="formAgeEdit">Age</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="formDateEdit" class="form-control datepicker">
              <label data-error="wrong" data-success="right" for="formDateEdit">Date</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="formSalaryEdit" class="form-control validate">
              <label data-error="wrong" data-success="right" for="formSalaryEdit">Salary</label>
            </div>
            <div class="md-form mb-5">
              <input type="text" id="formSalaryEdit11" class="form-control validate">
              <label data-error="wrong" data-success="right" for="formSalaryEdit11">Examples</label>
            </div>

          </div>
          <div class="modal-footer d-flex justify-content-center editInsideWrapper">
            <button class="btn btn-outline-secondary btn-block editInside" data-dismiss="modal">Edit
              form
              <i class="far fa-paper-plane ml-1"></i>
            </button>
          </div>
        </div>
      </div>
    </div>
    <div class="text-center buttonEditWrapper">
      <button class="btn btn-info btn-rounded btn-sm buttonEdit" data-toggle="modal" data-target="#modalEdit"
        disabled><i class="fas fa-pen-square"></i></a>
    </div>
    <div class="modal fade modalDeleteTarget" id="modalDelete" tabindex="-1" role="dialog" aria-labelledby="modalDelete"
      aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header text-center">
            <h4 class="modal-title w-100 font-weight-bold ml-5 text-danger">Delete</h4>
            <button type="button" class="close text-danger" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body mx-3">
            <p class="text-center h4">Are you sure to delete selected row?</p>
          </div>
          <div class="modal-footer d-flex justify-content-center deleteButtonsWrapper">
            <button type="button" class="btn btn-outline-danger btnYesClass btn-sm" id="btnYes" data-dismiss="modal">Yes
              <i class="far fa-paper-plane ml-1"></i>
            </button>
            <button type="button" class="btn btn-outline-primary btnNoClass btn-sm" id="btnNo" data-dismiss="modal">No
              <i class="far fa-paper-plane ml-1"></i>
            </button>
          </div>
        </div>
      </div>
    </div>
    <div class="text-center">
      <button class="btn btn-danger btn-sm btn-rounded buttonDelete" data-toggle="modal" disabled data-target="#modalDelete"
        disabled><i class="fas fa-times"></i></a>
    </div>
  </div>
  <table id="ex1" class="table table-striped table-bordered" cellspacing="0" width="100%">
    <thead>
      <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Extn.</th>
        <th>Start date</th>
        <th>Salary</th>
        <th>Examples</th>
      </tr>
    </thead>
    <tfoot>
      <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Extn.</th>
        <th>Start date</th>
        <th>Salary</th>
        <th>Examples</th>
      </tr>
    </tfoot>
  </table>
</div>