import Component from 'metal-component';
import {Config} from 'metal-state';
import Soy from 'metal-soy';

import templates from './Card.soy';

class ClayCard extends Component {

}

/**
 * State definition.
 * @static
 * @type {!Object}
 */
ClayCard.STATE = {
  /**
	 * Title of the card.
	 * @instance
	 * @memberof LexiconCard
	 * @type {!string}
	 * @default undefined
	 */
  title: Config.string().required(),

  /**
	 * Title of the card.
	 * @instance
	 * @memberof LexiconCard
	 * @type {!string}
	 * @default undefined
	 */
	description: Config.string()
};

Soy.register(ClayCard, templates);

export {ClayCard};
export default ClayCard;
