/* jshint ignore:start */
import Component from 'metal-component';
import Soy from 'metal-soy';

var templates;
goog.loadModule(function(exports) {
var soy = goog.require('soy');
var soydata = goog.require('soydata');
// This file was automatically generated from Card.soy.
// Please don't edit this file by hand.

/**
 * @fileoverview Templates in namespace ClayCard.
 * @public
 */

goog.module('ClayCard.incrementaldom');

var incrementalDom = goog.require('incrementaldom');
var soyIdom = goog.require('soy.idom');


/**
 * @param {Object<string, *>=} opt_data
 * @param {Object<string, *>=} opt_ijData
 * @param {Object<string, *>=} opt_ijData_deprecated
 * @return {void}
 * @suppress {checkTypes}
 */
function $render(opt_data, opt_ijData, opt_ijData_deprecated) {
  opt_ijData = opt_ijData_deprecated || opt_ijData;
  incrementalDom.elementOpenStart('div');
      incrementalDom.attr('class', 'card image-card');
  incrementalDom.elementOpenEnd();
    incrementalDom.elementOpenStart('div');
        incrementalDom.attr('class', 'card-bg');
    incrementalDom.elementOpenEnd();
      incrementalDom.elementOpenStart('img');
          incrementalDom.attr('alt', 'thumbnail');
          incrementalDom.attr('class', 'img-responsive');
          incrementalDom.attr('src', '$productImages');
      incrementalDom.elementOpenEnd();
      incrementalDom.elementClose('img');
    incrementalDom.elementClose('div');
    incrementalDom.elementOpenStart('div');
        incrementalDom.attr('class', 'card-body');
    incrementalDom.elementOpenEnd();
      incrementalDom.elementOpenStart('div');
          incrementalDom.attr('class', 'card-row');
      incrementalDom.elementOpenEnd();
        incrementalDom.elementOpenStart('div');
            incrementalDom.attr('class', 'autofit-col autofit-col-expand');
        incrementalDom.elementOpenEnd();
          incrementalDom.elementOpenStart('a');
              incrementalDom.attr('class', ' card-title');
              incrementalDom.attr('href', '#1');
          incrementalDom.elementOpenEnd();
          incrementalDom.elementClose('a');
          incrementalDom.elementOpenStart('div');
              incrementalDom.attr('class', 'card-subtitle');
          incrementalDom.elementOpenEnd();
          incrementalDom.elementClose('div');
        incrementalDom.elementClose('div');
      incrementalDom.elementClose('div');
      incrementalDom.elementOpenStart('div');
          incrementalDom.attr('class', 'card-row');
      incrementalDom.elementOpenEnd();
        incrementalDom.elementOpenStart('div');
            incrementalDom.attr('class', 'card-btns');
        incrementalDom.elementOpenEnd();
          incrementalDom.elementOpenStart('a');
              incrementalDom.attr('class', 'btn-border btn-border--primary add-to-cart-js');
          incrementalDom.elementOpenEnd();
            incrementalDom.text('Add to Cart');
          incrementalDom.elementClose('a');
        incrementalDom.elementClose('div');
      incrementalDom.elementClose('div');
    incrementalDom.elementClose('div');
  incrementalDom.elementClose('div');
}
exports.render = $render;
if (goog.DEBUG) {
  $render.soyTemplateName = 'ClayCard.render';
}

exports.render.params = [];
exports.render.types = {};
templates = exports;
return exports;

});

class ClayCard extends Component {}
Soy.register(ClayCard, templates);
export { ClayCard, templates };
export default templates;
/* jshint ignore:end */
