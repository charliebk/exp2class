class IfcTextStyle extends IfcPresentationStyle {
    constructor() {
        /** @type {IFCTEXTSTYLEFORDEFINEDFONT} */
        this.TextCharacterAppearance = null;
        /** @type {IFCTEXTSTYLETEXTMODEL} */
        this.TextStyle = null;
        /** @type {IFCTEXTFONTSELECT} */
        this.TextFontStyle = null;
        /** @type {IFCBOOLEAN} */
        this.ModelOrDraughting = null;
    }
}
