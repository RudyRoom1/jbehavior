Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: scenario description
Lifecycle:
Before:
Given the user is on the google translate page 'English' 'Ukrainian'

When the user looks up the translation of the word 'apple'
Then the user looks up the definition of the word  'the tree which bears apples.'
Then they should see the translate of word 'яблуко'
Then number of characters must be '5'