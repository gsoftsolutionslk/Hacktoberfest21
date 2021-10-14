from stack import Stack


def isMatch(p1, p2):
    if p1 == "(" and p2 == ")":
        return True
    elif p1 == "{" and p2 == "}":
        return True
    elif p1 == "[" and p2 == "]":
        return True
    else:
        return False


def isParenthesisBalanced(paren_string):
    s = Stack()
    isBalanced = True
    index = 0

    while index < len(paren_string) and isBalanced:
        paren = paren_string[index]
        if paren in '({[':
            s.push(paren)
        else:
            if s.isEmpty():
                isBalanced = False
            else:
                top = s.pop()
                if not isMatch(top, paren):
                    isBalanced = False

        index += 1
    if s.isEmpty() and isBalanced:
        return True
    else:
        return False


print(isParenthesisBalanced("(({[]}))"))
print(isParenthesisBalanced("[[]"))
