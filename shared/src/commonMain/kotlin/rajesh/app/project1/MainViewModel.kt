package rajesh.app.project1


import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SimpleViewModel {
    private val _textState = MutableStateFlow("")
    val textState: StateFlow<String> = _textState.asStateFlow()

    fun onTextChanged(newText: String) {
        _textState.value = newText
    }

    fun onButtonClick(): String {
        return if (_textState.value.isBlank()) {
            "Please enter some text first!"
        } else {
            "You typed: ${_textState.value}"
        }
    }
}