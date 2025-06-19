class IfcTextStyleTextModel extends IfcPresentationItem {
    constructor() {
        /** @type {IFCSIZESELECT} */
        this.TextIndent = null;
        /** @type {IFCTEXTALIGNMENT} */
        this.TextAlign = null;
        /** @type {IFCTEXTDECORATION} */
        this.TextDecoration = null;
        /** @type {IFCSIZESELECT} */
        this.LetterSpacing = null;
        /** @type {IFCSIZESELECT} */
        this.WordSpacing = null;
        /** @type {IFCTEXTTRANSFORMATION} */
        this.TextTransform = null;
        /** @type {IFCSIZESELECT} */
        this.LineHeight = null;
    }
}
