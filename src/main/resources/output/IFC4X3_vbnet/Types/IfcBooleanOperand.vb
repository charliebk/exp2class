' SELECT TYPE IfcBooleanOperand
' Options:
' - IfcBooleanResult
' - IfcCsgPrimitive3D
' - IfcHalfSpaceSolid
' - IfcSolidModel
' - IfcTessellatedFaceSet
Public Class IfcBooleanOperand
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcBooleanResult OrElse TypeOf value Is IfcCsgPrimitive3D OrElse TypeOf value Is IfcHalfSpaceSolid OrElse TypeOf value Is IfcSolidModel OrElse TypeOf value Is IfcTessellatedFaceSet) Then
            Throw New ArgumentException("Value must be one of: IfcBooleanResult, IfcCsgPrimitive3D, IfcHalfSpaceSolid, IfcSolidModel, IfcTessellatedFaceSet")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
