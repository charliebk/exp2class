class IfcIndexedColourMap extends IfcPresentationItem {
    constructor() {
        /** @type {IFCTESSELLATEDFACESET} */
        this.MappedTo = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.Opacity = null;
        /** @type {IFCCOLOURRGBLIST} */
        this.Colours = null;
        /** @type {IFCPOSITIVEINTEGER[]} */
        this.ColourIndex = null;
    }
}
